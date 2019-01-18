package homework1;
import java.util.Scanner;

/* Задание 2
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.  */

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int[] array = task2.createArray();

        for (int i = 9; i >= 0; i--) {
              System.out.println((i + 1) + "-й элемент массива: " + array[i]);
        }

    }

    public int[] createArray() {
        int[] array = new int[10];
        for (int i = 0; i <= 9; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = in.nextInt();
        }
        return array;
    }
}

