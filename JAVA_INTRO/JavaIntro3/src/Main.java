import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanSentence = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese frase");
        String sentence = scanSentence.next();
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());


    }
}