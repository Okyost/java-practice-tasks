package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры строку и число N больше 0.
 * Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
 * Пример ввода:
 * абв
 * 2
 * Пример вывода:
 * абв
 * абв
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать текст c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Каждое значение должно быть выведено с новой строки.
 * 4.	Программа должна выводить на экран строку N раз.
 * 5.	В программе должен использоваться цикл while.
 */

public class Task32 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sl = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        int n = 0;
        while (n<num){
            System.out.println(sl);
            n++;
        }

    }
}
