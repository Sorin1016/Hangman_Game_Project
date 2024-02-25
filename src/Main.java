import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<String[]> pictures =
                new ArrayList<>(Arrays.asList(new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "       |\n",
                        "       |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        "       |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        "  |    |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        " /|    |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        " /|\\   |\n",
                        "       |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        " /|\\   |\n",
                        " /     |\n",
                        "       |\n",
                        "=========\n"
                },
                new String[] {
                        "  +----+\n",
                        "  |    |\n",
                        "  O    |\n",
                        " /|\\   |\n",
                        " / \\   |\n",
                        "       |\n",
                        "=========\n"
                }));
        int attempts = 7;
        ArrayList<String> words = new ArrayList<>(Arrays.asList("perfume", "transport", "manager", "woman", "proportion"
                , "prestige", "vegetable", "environment", "obligation", "example", "liability"));
        int index = rnd.nextInt(words.size());
        System.out.println("Welcome to HangMan");
        System.out.print("Cuvantul este: ");
        String hiddenWord = words.get(index);
        ArrayList<Character> usedLetters = new ArrayList<>();
        char[] stars = new char[hiddenWord.length()];
        Arrays.fill(stars, '*');
        System.out.println(String.valueOf(stars));

        while (true) {
            boolean isLetterFound = false;
            System.out.println("Introduceti o litera");
            char letter = sc.next().charAt(0);

            if (!usedLetters.contains(letter)) {
                usedLetters.add(letter);
            } else {
                System.out.println("You have already used this letter.");
            }

            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == letter) {
                    stars[i] = letter;
                    isLetterFound = true;
                }
            }

            if (!isLetterFound) {
                attempts--;
                System.out.println("You have " + attempts + " attempts left.");
                for (String line : pictures.get(0)){
                    System.out.println(line);
                }
                pictures.remove(0);
            }

            if (pictures.isEmpty()) {
                System.out.println("Game over ! Try again !");
                break;
            }

            System.out.println(String.valueOf(stars));
            if (hiddenWord.equalsIgnoreCase(String.valueOf(stars))) {
                System.out.println("Felicitari, ai gasit cuvantul.");
                break;
            }
        }
    }
}

