import java.util.Scanner;

public class JavaIntro6 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        JavaIntro6 funciones = new JavaIntro6();
        Scanner scanNumber = new Scanner(System.in);
        int num;
        do {
            System.out.println("ingrese un numero");
            num = scanNumber.nextInt();
            if (funciones.esPar(num)){
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

    public boolean esPar(int a){
        return (a%2==0);

    }
}