package org.example;
import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        String str = "Hello, world";
        String[] words = str.split(" ");

        if (words.length >= 2) {
            words[1] = name;
            str = String.join(" ", words);
            System.out.println(str);
        } else {
            System.out.println("плохо");
        }
    }
}