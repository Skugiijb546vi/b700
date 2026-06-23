import subprocess
import os
import re
from collections import Counter

def run_compilation():
    print("Compiling project to gather errors...")
    # Change dir to project root
    os.chdir(r"C:\Users\sarko\Downloads\ninja_engine_project")
    # Using gradlew.bat
    cmd = [r".\gradlew.bat", "compileDebugJavaWithJavac", "-PcompilerArgs=-Xmaxerrs 10000"]
    result = subprocess.run(cmd, capture_output=True, text=True)
    return result.stdout + "\n" + result.stderr

def parse_errors(output):
    print("Parsing errors...")
    error_pattern = re.compile(r'^(.*?\.java):(\d+): error: (.*)$')
    errors = []
    
    lines = output.split('\n')
    for line in lines:
        match = error_pattern.search(line)
        if match:
            file_path = match.group(1).strip()
            line_num = int(match.group(2))
            error_msg = match.group(3).strip()
            errors.append({
                'file': file_path,
                'line': line_num,
                'msg': error_msg
            })
    return errors

def analyze_errors(errors):
    print(f"Total errors found: {len(errors)}")
    # Simplify error messages to group them
    simplified_msgs = []
    for e in errors:
        msg = e['msg']
        # Remove specific variable/class names to group better
        msg = re.sub(r': [^\s]+ cannot be converted to [^\s]+', ': TYPE cannot be converted to TYPE', msg)
        msg = re.sub(r'variable [^\s]+', 'variable VAR', msg)
        msg = re.sub(r'method [^\s]+ in class [^\s]+ cannot be applied to given types', 'method METHOD in class CLASS cannot be applied to given types', msg)
        msg = re.sub(r'constructor [^\s]+ in class [^\s]+ cannot be applied to given types', 'constructor CONSTRUCTOR in class CLASS cannot be applied to given types', msg)
        msg = re.sub(r'not an enclosing class: [^\s]+', 'not an enclosing class: CLASS', msg)
        msg = re.sub(r'cannot find symbol', 'cannot find symbol', msg)
        simplified_msgs.append(msg)
        
    counts = Counter(simplified_msgs)
    print("\nTop 20 most common error types:")
    for msg, count in counts.most_common(20):
        print(f"{count}: {msg}")

if __name__ == "__main__":
    output = run_compilation()
    errors = parse_errors(output)
    analyze_errors(errors)
