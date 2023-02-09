package week8.part2;

import week8.part1.WeekDays;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    private static final String PKG_DIRECTORY = "/Users/aleksejcernysev/IdeaProjects/javaCourseSemomars/src/week8/part2";
    private static final String OUTPUT_FILE_NAME = "output.txt";
    private ReadFile(){}

    public static void readDataFromFile(String filePath) throws IOException {
        Scanner scanner = new Scanner( new File(filePath));
        String[] days = new String[10];
        int i = 0;
        while (scanner.hasNextLine()) {
            days[i++] = scanner.nextLine();
            System.out.println(days[i-1]);
        }
        Writer writer = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME);
        for (int j = 0; j<i; j++){
            String res = "Порядковый номер для дня недели: " + days[j] + " равен: "
                    + WeekDays.ofName(days[j]).getDayNumber() + "\n";
            writer.write(res);
        }

        writer.close();
        scanner.close();
    }
}
