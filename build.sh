
echo "kotlinc..."
kotlinc test/*.kt -include-runtime
echo "kotlinc complete\njavac..."
javac test/*.java
echo "javac complete"