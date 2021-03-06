package lesson03.part01;

/**
 * Создать class Dog. У собаки должна быть кличка String name и возраст int age.
 * Создайте геттеры и сеттеры для всех переменных класса Dog.
 *
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	У класса Dog должна быть переменная name с типом String.
 * 3.	У класса Dog должна быть переменная age с типом int.
 * 4.	У класса должен быть сеттер для переменной name.
 * 5.	У класса должен быть геттер для переменной name.
 * 6.	У класса должен быть сеттер для переменной age.
 * 7.	У класса должен быть геттер для переменной age.
 */

public class Task02 {

    public static void main(String[] args) {

    }

    public static class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) this.age = age;
            else System.out.println("Ошибка");
        }
    }

}


