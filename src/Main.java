import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Afiseaza la consola "Welcome to hangman"
        // 2. Afiseaza cuvantul este: "*****"
        // 3. Cere o litera de la user
        // 4. citeste o litera de la consola si salveaza intr-o variabila
        // 5. Parcurgem cuvantul si comparam fiecare litera din cuvant cu litera salvata
        // 6. Daca exista litera inlocuim litera de la pozitia literei din cuvant in sirul de stelute

        System.out.println("Welcome to HangMan");
        System.out.print("Cuvantul este: ");
        String hiddenWord = "avion";
        char[] stars = new char[hiddenWord.length()];
//        for (int i = 0; i < stars.length; i++) {
//            stars[i] = '*';
//        }
        Arrays.fill(stars, '*');
        System.out.println(String.valueOf(stars));

    }
}
