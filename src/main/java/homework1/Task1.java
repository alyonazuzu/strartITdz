package homework1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Ввести с клавиатуры число и имя, вывести на экран строку:

Я "имя” и мне "число” лет!

Пример:
 Я “Анатолий” и мне “7” лет!

Последовательность вводимых данных имеет большое значение.
Требования:
•Программа должна выводить текст.
•Программа должна считывать данные с клавиатуры.
•Выведенный текст должен содержать введенное имя.
•Выведенный текст должен содержать введенное число. 
 */

public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        List userParameters = task1.getUserParameters();

        System.out.println("Я " +  userParameters.get(0) +" и мне " + userParameters.get(1) + " лет!");

    }

    public List<String> getUserParameters () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        String age = in.nextLine();

        List<String> userParameters;
        userParameters = Arrays.asList(
                name,
                age);
        return userParameters;
    }

}
