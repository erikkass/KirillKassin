package by.tms.homework8.task3;

import java.util.List;

public final class Mark {

    private Mark() {
    }

    public static List markLength4(List list) {
        String str = "****";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().length() == str.length()) {
                list.add(i, str);
                i++;
            }
        }
        return list;
    }
}
