package LessonFive;

import java.util.Scanner;

public class FifthLesson {
    public static void main(String[] args) {
        System.out.println("Введите номер в последовательности Фибоначчи");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

            long a = 0;
            long b = 1;
            for (int i = 2; i <= n; ++i) {
                long next = a + b;
                a = b;
                b = next;
            }

            // вывод n-ого по счёту числа Фибоначчи
            System.out.println(n + "-ый член последовательности Фибоначчи равен " + b);

    }
}
