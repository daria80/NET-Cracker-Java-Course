package Exercises;

import java.util.Scanner;

public class E2_30 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double a ,b ,c ,d ,e ,f ,g ,h ,k ,l;
        System.out.println("Введите часы");
        a = in.nextDouble();
        System.out.println("Введите минуты");
        b = in.nextDouble();
        c = b / 60;
        d = a + c;
        e = d * 60;
        f = 1440 - e;
        g = f / 60;
        h = Math.floor(g);
        k = g % 1;
        l = Math.round(k * 60);
        System.out.println("До полуночи осталось часов: " + h + "; минут: " + l + ";");
    }
}
