package by.tms.homework11RegexAPI;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String mail = "abc1_df2_3@gmail.com";
        System.out.println(isEmail(mail));
    }

    public static boolean isEmail(String mail) {
        return Pattern.matches("[a-zA-Z]\\w+@[a-z]+\\.(org|com)", mail);
    }
}
