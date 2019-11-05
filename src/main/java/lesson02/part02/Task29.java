package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
 * в следующем виде:
 * "количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
 * Примеры:
 * а) при вводе чисел
 * 2
 * 5
 * 6
 * получим вывод
 * количество отрицательных чисел: 0
 * количество положительных чисел: 3
 * <p>
 * б) при вводе чисел
 * -2
 * -5
 * 6
 * получим вывод
 * количество отрицательных чисел: 2
 * количество положительных чисел: 1
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Программа должна выводить количество отрицательных чисел в исходном наборе.
 * 4.	Программа должна выводить количество положительных чисел в исходном наборе.
 * 5.	Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
 * 6.	Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
 * 7.	Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
 */


public class Task29 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num1 = Integer.parseInt(reader.readLine());
        Integer num2 = Integer.parseInt(reader.readLine());
        Integer num3 = Integer.parseInt(reader.readLine());
        if (num1>0 && num2>0 && num3>0) {
            System.out.println("количество отрицательных чисел: 0");
            System.out.println("количество положительных чисел: 3");
        }
        else if (num1 > 0 && num2 > 0 || num2 > 0 && num3 > 0 || num1 > 0 && num3 > 0){
            System.out.println("количество отрицательных чисел: 1");
            System.out.println("количество положительных чисел: 2");
        }
        else if (num1 > 0 || num2 > 0 || num3 > 0) {
            System.out.println("количество отрицательных чисел: 2");
            System.out.println("количество положительных чисел: 1");
        }
        else {
            System.out.println("количество отрицательных чисел: 3");
            System.out.println("количество положительных чисел: 0");
        }
    }



}
