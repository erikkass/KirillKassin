package by.tms.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNumber {
    public static void main(String[] args) {
        List<Integer> intNum = new ArrayList<>(Arrays.asList(5,2,4,2,1));
        getStringNum(intNum);
    }

    public static void getStringNum (List<Integer> intNum){
        String collect = intNum.stream()
                .map(num -> num.toString())
                .collect(Collectors.joining());
        System.out.println("Список целых чисел: " + intNum);
        System.out.println("Строка чисел: " + collect);
    }
}
