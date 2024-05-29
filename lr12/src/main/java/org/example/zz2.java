package org.example;
public class zz2 {
    public static void main(String[] args) {
        z2.Primer();

        z2 tester1 = new z2();
        z2 tester2 = new z2("Абв", "Абв");
        z2 tester3 = new z2("Анна", "Романовская", 5, "Intermediate", 50000.0);

        // Выводим информацию о каждом тестировщике
        System.out.println("Тест 1:");
        tester1.printInfo();
        System.out.println();

        System.out.println("Тест 2:");
        tester2.printInfo();
        System.out.println();

        System.out.println("Тест 3:");
        tester3.printInfo();
        System.out.println();

        // Вызываем перегруженные методы
        tester3.printInfo("Привет");
        tester3.printInfo("Hello", "Пока");
    }
}