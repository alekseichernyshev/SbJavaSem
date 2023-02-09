package week8.part2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) throws IOException {
        String fileLocation = "/Users/aleksejcernysev/IdeaProjects/javaCourseSemomars/src/week8/part2/input.txt";
        ReadFile.readDataFromFile(fileLocation);

    }
}
