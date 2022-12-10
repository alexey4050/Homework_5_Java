package Homework5;

import java.util.*;

public class Homework5 {

    public static void main(String[] args) {
        //1.Создать словарь HashMap. Обобщение <Integer, String>.
        Map<Integer, String> javaLessonsMap = new HashMap<>();
        System.out.println(
                "Задание №1\nИнициализируем словарь в котором будут храниться номeр и цвет.");
        System.out.println();

        //2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        System.out.println("Задание №2\nНаполняем словарь информацией:");
        javaLessonsMap.put(1, "Color is red");
        javaLessonsMap.put(2, "Color is green");
        javaLessonsMap.put(3, "Color is orange");
        javaLessonsMap.forEach((a, b) -> System.out.println("Номер цвета: " + a + ". Цвет: " + b));
        System.out.println();

        System.out.println("Задание №4\nДобавляем новый цвет в словарь:");
        javaLessonsMap.computeIfAbsent(4, b ->getNewValue());
        javaLessonsMap.forEach((a, b) -> System.out.println("Номер цвета: " + a + ". Цвет: " + b));
        System.out.println();
        
        //3. Изменить значения дописав восклицательные знаки.
        System.out.println("Задание №3\nПридаем эмоциональную окраску цвету:");
        javaLessonsMap.replaceAll((a, b) -> b + "!");
        javaLessonsMap.forEach((a, b) -> System.out.println("Номер цвета: " + a + ". Цвет: " + b));
        System.out.println();

        // 4. Создать TreeMap, заполнить аналогично.

        TreeMap<Integer, String> lessonsMap = new TreeMap<>();
        System.out.println("Задание №4\nНаполняем новый словарь информацией:");
        lessonsMap.put(1, "Color is white");
        lessonsMap.put(2, "Color is black");
        lessonsMap.put(3, "Color is green");
        lessonsMap.forEach((a, b) -> System.out.println("Номер цвета: " + a + ". Цвет: " + b));
        System.out.println();

    }
    // 2
    public static String getNewValue() {
        return "Color is black";
    }

}
    

