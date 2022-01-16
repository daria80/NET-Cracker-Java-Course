package Exercises;

import java.util.Scanner;

class E2_33 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, h;
        double s;
        System.out.println("Введите первое основание трапеции");
        a = in.nextInt();
        System.out.println("Введите второе основание трапеции");
        b = in.nextInt();
        System.out.println("Введите высоту трапеции");
        h = in.nextInt();
        s = (0.5 * (a + b)) * h;
        System.out.println("Площадь трапеции равна: " + s);
    }
}
