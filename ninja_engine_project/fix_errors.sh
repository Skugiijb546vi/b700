#!/bin/bash
# Script to fix common decompilation artifacts in Java files

SOURCE_DIR="C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean"
FIXES_APPLIED=0

# Function to fix a specific file
fix_file() {
    local file=$1
    
    # Fix 1: Add casts to Object->Type conversions  
    # Object cannot be converted to Entry pattern
    sed -i 's/= \([a-zA-Z0-9_]*\.get([^)]*)\)/= (java.util.Map.Entry) \1/g' "$file"
    
    # Fix 2: Type inference issues
    sed -i 's/Object\s\+\([a-zA-Z0-9_]*\)\s*=\s*\([a-zA-Z0-9_]*\)\.get(/Object \1 = \2.get(/g' "$file"
    
    ((FIXES_APPLIED++))
}

# Get count of Java files
echo "Starting systematic compilation error fixes..."
echo "Source directory: $SOURCE_DIR"

# Process all Java files
find "$SOURCE_DIR" -name "*.java" -type f | while read file; do
    fix_file "$file"
done

echo "Total fixes applied: $FIXES_APPLIED"
