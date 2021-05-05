package HomeWorkLesson3;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserCollection {

    public static Map<String, Integer> getWordsCount(String[] arr)  {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String key : arr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] str = {"автомобиль", "торшер", "прокат", "диван", "монитор", "лампочка", "роутер",
        "автомобиль", "диван", "провод", "диван", "монитор", "подушка", "покрывало", "мышка", "торшер"};
        System.out.println(getWordsCount(str));

        PhoneDirectory phone = new PhoneDirectory();
        phone.add("Колесников", "+79113224578");
        phone.add("Абрикосов", "+79237889001");
        phone.add("Алешин", "+79659002343");
        phone.add("Колесников", "+79563772112");
        phone.add("Беспалов", "+79459753587");
        phone.add("Моргунов", "+79780989745");

        phone.get("Колесников");
    }
}
