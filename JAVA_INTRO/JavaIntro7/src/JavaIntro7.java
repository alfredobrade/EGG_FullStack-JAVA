import java.util.Scanner;

public class JavaIntro7 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanSentence = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase");
        String sentence = scanSentence.next();
        sentence = sentence.toLowerCase(); //pasamos a loweCase para solo comparar que diga lo mismo
        //System.out.println(sentence);
        if (sentence.equals("eureka")){
            System.out.println("Correcto");
        }else {
            System.out.println("incorrecto");
        }

    }
}