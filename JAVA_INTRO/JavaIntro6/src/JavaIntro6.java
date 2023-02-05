import java.util.Scanner;

public class JavaIntro6 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanNumber = new Scanner(System.in);
        int num;
        do {
            System.out.println("ingrese un numero");
            num = scanNumber.nextInt();
            if (num%2==0){
                System.out.println("es par");
            }else {
                System.out.println("es impar");
            }

        }while (num != 0);

        /*
        public boolean esPrimo(int a){
            return (a%2==0);
        }
        */


    }
}