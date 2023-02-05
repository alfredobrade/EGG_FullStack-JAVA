import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanTemperature = new Scanner(System.in);
        System.out.println("ingrese temperatura en grados centigrados (°C)");
        Double temperature = scanTemperature.nextDouble();
        System.out.println("Equivale a "+ (32+(9*(temperature/5))) +"°F");
        // esto debería estar dentro de una funcion pero en este caso se lo resuelve rapido
    }
}