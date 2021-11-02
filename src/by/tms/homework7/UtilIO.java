package by.tms.homework7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;

public final class UtilIO {

    public UtilIO() {
    }

    public static void poemCountLetter(String poem) throws FileNotFoundException {
        final char LETTERS[] = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        if (poem != null) {
            try {
                String result = Files.readString(Path.of(poem));
                int count = 0;
                char letter;
                for (int i = 0; i < LETTERS.length; i++) {
                    for (int j = 0; j < result.length(); j++) {
                        letter = result.toLowerCase().charAt(j);
                        if (letter == LETTERS[i]) {
                            count++;
                        }
                    }
                    try {
                        FileWriter writer = new FileWriter(poem, true);
                        writer.write(LETTERS[i] + " - " + count + "\n");
                        count = 0;
                        writer.flush();

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int[] getArrayRandomNum() {
        int[] random = new int[20];
        Random r = new Random();
        r.nextInt();
        for (int i = 0; i < random.length; i++) {
            random[i] = r.nextInt(20);
        }
        return random;
    }

    public static void randomNumbers() {
        try {
            File randomNums = new File("resources/randomNums.txt");
            File sortRandomNums = new File("resources/sortRandomNums.txt");
            boolean createdRandomNumsFile = randomNums.createNewFile();
            boolean createdSortRandomNumsFile = sortRandomNums.createNewFile();
            BufferedWriter writeRandomNums = new BufferedWriter(new FileWriter(randomNums));
            BufferedWriter writerSortNums = new BufferedWriter(new FileWriter(sortRandomNums));
            int[] arrayRandomNum = getArrayRandomNum();
            writeRandomNums.write(Arrays.toString(arrayRandomNum));
            writeRandomNums.flush();
            Arrays.sort(arrayRandomNum);
            writerSortNums.write(Arrays.toString(arrayRandomNum));
            writerSortNums.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}