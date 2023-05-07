import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Afiseaza la consola "Welcome to hangman"
        // 2. Afiseaza cuvantul este: "*****"
        // 3. Cere o litera de la user
        // 4. citeste o litera de la consola si salveaza intr-o variabila
        // 5. Parcurgem cuvantul si comparam fiecare litera din cuvant cu litera salvata
        // 6. Daca exista litera inlocuim litera de la pozitia literei din cuvant in sirul de stelute
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<String> words = new ArrayList<>(Arrays.asList("perfume", "transport", "manager", "woman", "proportion"
                , "prestige", "vegetable", "environment", "obligation", "example", "liability"));
        int index = rnd.nextInt(words.size());
        System.out.println("Welcome to HangMan");
            System.out.print("Cuvantul este: ");
            String hiddenWord = words.get(index);
            char[] stars = new char[hiddenWord.length()];
//        for (int i = 0; i < stars.length; i++) {
//            stars[i] = '*';
//        }
            Arrays.fill(stars, '*');
            System.out.println(String.valueOf(stars));
        while (true) {
            System.out.println("Introduceti o litera");
            char letter = sc.next().charAt(0);
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == letter) {
                    stars[i] = letter;
                }
            }
            System.out.println(String.valueOf(stars));
            if (hiddenWord.equalsIgnoreCase(String.valueOf(stars))){
                System.out.println("Felicitari, ai gasit cuvantul.");
                break;
            }
        }
    }
}

