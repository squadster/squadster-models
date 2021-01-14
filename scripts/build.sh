
echo "Starting building"
./gradlew jar
echo "End of building"

echo "Starting releasing"
./gradlew publish
echo "End of releasing"
