//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Задача 1: Четное или нечетное число
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Четное число");
//        }
//        else {
//            System.out.println("Нечетное число");
//        }


//        Задача 2: Минимальное из трех чисел
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите три целых числа: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int min = Math.min(a, Math.min(b, c));
//        System.out.println("Минимальное число: " + min);


//        Задача 3: Таблица умножения
//        System.out.println("Таблица умножения на 5:");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("5 * " + i + " = " + (5 * i));
//        }


//        Задача 4: Сумма чисел от 1 до N
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        int sum = (n * (n + 1)) / 2;
//        System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);

//        Задача 5: Число Фибоначчи
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        int a = 0, b = 1;
//        System.out.print("Фибоначчи: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + " ");
//            int temp = a;
//            a = b;
//            b = temp + b;
//        }


//        Задача 6: Проверка простого числа
//        Scanner s = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = s.nextInt();
//        boolean isPrime = true;
//
//        if (number <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        System.out.println(isPrime ? "Простое число" : "Не простое число");

//        Задача 7: Обратный порядок чисел
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        for (int i = n; i >= 1; i--) {
//            System.out.print(i + " ");
//        }


//        Задача 8: Сумма четных чисел
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число A: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите целое число B: ");
//        int b = scanner.nextInt();
//        int sum = 0;
//
//        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//
//        System.out.println("Сумма четных чисел: " + sum);


//        Задача 9: Реверс строки
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String reversed = new StringBuilder(input).reverse().toString();
//        System.out.println("Обратный порядок: " + reversed);


//        Задача 10: Количество цифр в числе
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//        int count = String.valueOf(Math.abs(number)).length();
//        System.out.println("Количество цифр: " + count);


//        Задача 11: Факториал числа
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = scanner.nextInt();
//        long factorial = 1;
//
//        for (int i = 2; i <= n; i++) {
//            factorial *= i;
//        }
//
//        System.out.println("Факториал " + n + " равен: " + factorial);


//        Задача 12: Сумма цифр числа
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = Math.abs(scanner.nextInt());
//        int sum = 0;
//
//        while (number > 0) {
//            sum += number % 10;
//            number /= 10;
//        }
//
//        System.out.println("Сумма цифр: " + sum);


//        Задача 13: Палиндром
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String reversed = new StringBuilder(input).reverse().toString();
//
//        System.out.println(input.equals(reversed) ? "Палиндром" : "Не палиндром");


//        Задача 14: Найти максимальное число в массиве
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.print("Введите элементы массива: ");
//
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        int max = array[0];
//        for (int num : array) {
//            if (num > max) {
//                max = num;
//            }
//        }
//
//        System.out.println("Максимальное число: " + max);


//        Задача 15: Сумма всех элементов массива
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.print("Введите элементы массива: ");
//
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        int sum = 0;
//        for (int num : array) {
//            sum += num;
//        }
//
//        System.out.println("Сумма элементов массива: " + sum);


//        Задача 16: Количество положительных и отрицательных чисел
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.print("Введите элементы массива: ");
//
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        int positiveCount = 0, negativeCount = 0;
//        for (int num : array) {
//            if (num > 0) positiveCount++;
//            if (num < 0) negativeCount++;
//        }
//
//        System.out.println("Положительных чисел: " + positiveCount);
//        System.out.println("Отрицательных чисел: " + negativeCount);


//        Задача 17: Простые числа в диапазоне
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число A: ");
//        int a = scanner.nextInt();
//        System.out.print("Введите число B: ");
//        int b = scanner.nextInt();
//
//        System.out.println("Простые числа в диапазоне: ");
//        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//
//    private static boolean isPrime(int number) {
//        if (number <= 1) return false;
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) return false;
//        }
//        return true;


//        Задача 18: Подсчет гласных и согласных в строке
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine().toLowerCase();
//
//        int vowels = 0, consonants = 0;
//        for (char c : input.toCharArray()) {
//            if (Character.isLetter(c)) {
//                if ("аеёиоуыэюя".contains(String.valueOf(c))) {
//                    vowels++;
//                } else {
//                    consonants++;
//                }
//            }
//        }
//
//        System.out.println("Гласные: " + vowels);
//        System.out.println("Согласные: " + consonants);


//        Задача 19: Перестановка слов в строке
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String[] words = input.split(" ");
//        StringBuilder reversed = new StringBuilder();
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]).append(" ");
//        }
//
//        System.out.println("Слова в обратном порядке: " + reversed.toString().trim());


//        Задача 20: Число Армстронга
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = scanner.nextInt();
//        int original = number;
//        int sum = 0;
//        int digitsCount = String.valueOf(number).length();
//
//        while (number > 0) {
//            int digit = number % 10;
//            sum += Math.pow(digit, digitsCount);
//            number /= 10;
//        }
//
//        System.out.println(original == sum ? "Число Армстронга" : "Не число Армстронга");

    }
}