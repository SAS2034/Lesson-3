import One.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.LinkedList;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        // task1(); //Создайте массив из пяти чисел и выведите их на экран в обратном порядке.
        // task2(); //Создайте массив из семи элементов с помощью генератора случайных чисел и выведите его на экран.
                    // Увеличьте все его элементы в 2 раза.
        // task3(); //Создайте массив из восьми элементов с помощью генератора случайных чисел с элементами от –10 до 10 и выведите его на экран.
                    // Подсчитайте количество отрицательных элементов массива.
        // task4(); //Создайте массив из двенадцати элементов с помощью генератора случайных чисел с элементами от –20 до 10 и выведите его на экран.
                    // Замените все отрицательные элементы массива числом 0.
        // task5(); // Создайте класс User с полями firstName, lastName и age. В другом классе в методе main
                    //  создайте массив объектов класса User с произвольными данными и с помощью цикла выведите на экран
                    //  строки формата: “Last name:  <lastName>, name: <firstName> - <age>”
    }
    //задача 1
    static void task1() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i += 1) {
            arr[i] = i + 1;
            System.out.print(arr[i]);
        }
        System.out.print("Элементы в обратном порядке");
        for (int b = 4; b >= 0; b -= 1) {
            System.out.print(arr[b]);
        }
    }
    //задача 2 заполнить массив случайными числами
    static void task2() {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.println(Arrays.toString(array));
    }
    /* Задача 3.Создать массив из восьми эл-тов с помощью генератора случайных чисел с эл-тами от
    –10 до 10 вывести его на экран. Подсчитать кол-во отрицательных эл-тов массива. */
    static void task3() {
        int[] array = new int[8]; //создаем массив на 8 элементов
        int positive = 0, negative = 0, zero = 0;
        Random random = new Random(); //заполняем массив случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10; // случайное число из интервала [-10, 10]
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество положительных элементов: " + positive);
        System.out.println("Количество отрицательных элементов: " + negative);
        System.out.println("Количество нулевых элементов: " + zero);
    }
    /* Задача 4.Создайте массив из 12 элементов с помощью генератора случайных чисел с элементами
     от –20 до 10 и выведите его на экран. Замените все отрицательные элементы массива числом 0 */
    static void task4() {
        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10; // случайное число из интервала [-10, 10]
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    /* Задача 5 Создайте класс User с полями firstName, lastName и age.
     В другом классе в методе main создайте массив объектов класса User
     с произвольными данными и с помощью цикла выведите на экран строки формата:
     “Last name:  <lastName>, name: <firstName> - <age>” */
        static void task5() {
            List<User> user = Arrays.asList(new User("Смирнов", "Святослав",15),
                    new User("Иванов", "Елисей",25),
                    new User("Петров", "Елизар",20),
                    new User("Сидоров", "Святополк",33),
                    new User("Егоров", "Святозар",27)
            );

            //Optional<User> userName = user.stream().filter(s -> s.getName().startsWith("A")).findFirst();
            System.out.println("User name is: " + user);
        }
}

