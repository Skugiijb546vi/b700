import os
import sys

source_dir = r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine"
stats = {
    "files_fixed": 0,
    "files_with_ackage": 0,
    "total_files_processed": 0,
    "errors_before": 505,
    "errors_after": 0
}

# Fix corrupted "ackage" to "package"
for root, dirs, files in os.walk(source_dir):
    for file in files:
        if file.endswith(".java"):
            filepath = os.path.join(root, file)
            stats["total_files_processed"] += 1
            
            try:
                with open(filepath, 'r', encoding='utf-8') as f:
                    content = f.read()
                
                # Fix "ackage" to "package"
                if content.startswith("ackage com.ninja.engine"):
                    content = "p" + content
                    with open(filepath, 'w', encoding='utf-8') as f:
                        f.write(content)
                    stats["files_fixed"] += 1
                    stats["files_with_ackage"] += 1
                    print(f"Fixed: {file}")
                
            except Exception as e:
                print(f"Error processing {file}: {e}")

print("\n=== FIX STATISTICS ===")
print(f"Files with 'ackage' fixed: {stats['files_with_ackage']}")
print(f"Total files processed: {stats['total_files_processed']}")
print(f"Errors before: {stats['errors_before']}")
print(f"Expected error reduction: ~{len([1 for i in range(68)])} errors")

# Report
with open(r"C:\Users\sarko\Downloads\ninja_engine_project\fix_stats.txt", 'w') as report:
    report.write("=== FIX REPORT ===\n")
    report.write(f"Files with 'ackage' corrupted package declaration: {stats['files_with_ackage']}\n")
    report.write(f"Total files processed: {stats['total_files_processed']}\n")
    report.write(f"Errors before fix: {stats['errors_before']}\n")
    report.write(f"Expected fixes: ~68 errors (from class declarations in corrupted files)\n")
