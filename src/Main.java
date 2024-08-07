import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("_____Задача №1_____");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            int a = nums.get(i) % 2;
            if (a != 0) {
                System.out.println(nums.get(i));
            }
        }


        System.out.println("_____Задача №2_____");

        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(numbers);
        Set<Integer> numbers2 = new HashSet<>(List.of());
        for (int i = 0; i < numbers.size(); i++) {
            int a = numbers.get(i) % 2;
            if (a == 0) {
                numbers2.add(numbers.get(i));
            }
        }
        System.out.println(numbers2);


        System.out.println("_____Задача №2 второй вариант_____");
        List<Integer> numbers5 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(numbers5);
        int min = Integer.MIN_VALUE;
        for (int a:numbers5)
            if (a % 2 == 0 && a!=min) {
                System.out.println(a);
                min = a;
            }



        System.out.println("_____Задача №3_____");
        Set<String> names = new HashSet<>(List.of("Георгий", "Света", "Алина", "Алина", "Роман", "Георгий"));
        System.out.println(names);

        System.out.println("_____Задача №3 второй вариант_____");
        List<String> names2 = new ArrayList<>(List.of("Георгий", "Света", "Алина", "Алина", "Роман", "Георгий"));
        Set<String> names3 = new HashSet<>(names2);
        System.out.println(names);

        System.out.println("_____Задача №4_____");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> strings2 = new HashSet<>(List.of());
        for (int i = 0; i < strings.size(); i++) {
            strings2.add(String.valueOf(Collections.frequency(strings, strings.get(i))));
        }
        System.out.println(strings2);
    }
}