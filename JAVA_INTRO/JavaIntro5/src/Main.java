import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanNum = new Scanner(System.in);
        System.out.println("ingresar numero");
        int number = scanNum.nextInt();
        System.out.println("x2 = " + number*2);
        System.out.println("x3 = " + number*3);
        System.out.println("^-2 = " + Math.sqrt((number)));
    }
}