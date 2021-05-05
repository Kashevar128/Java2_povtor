package HomeWorkLesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneDirectory {

    private final HashMap<String, List<String>> tel;
    private final Pattern pattern;

    PhoneDirectory() {
        tel = new HashMap<>();
        pattern = Pattern.compile("^((\\+7)([0-9]{10}))$");
    }

    public void add(String key, String value) {
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            if (!tel.containsKey(key)) {
                tel.put(key, new ArrayList<>());
            }
            tel.get(key).add(value);
        } else System.out.println("Неверный формат номера");
        System.out.println(tel);
    }

    public void get(String key) {
        System.out.println(tel.get(key));
    }
}
