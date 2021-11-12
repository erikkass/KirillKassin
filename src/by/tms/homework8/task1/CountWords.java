package by.tms.homework8.task1;

import java.io.*;
import java.util.*;

public final class CountWords {

    private CountWords() {
    }

    public static void getWord(File file) throws FileNotFoundException {
        List<String> text = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String st;
            while ((st = br.readLine()) != null) {
                text = Arrays.asList(st);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Set<String> poem2 = new HashSet<>(text);
        List<String> poem3 = new ArrayList<>(poem2);
        int count = 0;
        String str;
        for (int i = 0; i < poem3.size(); i++) {
            for (int j = 0; j < text.size(); j++) {
                str = poem3.get(i);
                if (str == text.get(j)) {
                    count++;
                }
            }
            System.out.println(poem3.get(i) + " - " + count);
            count = 0;
        }
    }
}
