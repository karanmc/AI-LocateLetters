import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by karan on 2017-04-05.
 */

/**
 * Simple class to take in a word and guessed letter.
 * Output: indexes where letter exists and display of letter positions within word.
 */
public class LocateLetters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.print("_ ");
        }

        System.out.print("\n\n");
        System.out.println("Guess a letter: ");
        char guessedLetter = sc.next().charAt(0);

        locateLetter(word, guessedLetter);
    }


    public static void locateLetter(String word1, char guess) {
        StringBuilder builder = new StringBuilder(word1);
        int length = builder.length();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (guess == builder.charAt(i)) {
                list.add(i);
            }
        }

        String listString = Arrays.toString(list.toArray());
        if (!listString.isEmpty()) {
            System.out.println(guess + " exists at index: " + listString + "\n");
        }
        else {
            System.out.println("Letter does not exist");
        }

        for (int j = 0; j < length; j++) {
            if (list.contains(j)) {
                System.out.print(guess + " ");
            }
            else {
                System.out.print("_ ");
            }
        }
    }

}
