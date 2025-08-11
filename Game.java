import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        System.out.println("=== Welcome to the Word Guessing Game! ===");
        System.out.println("You have to guess the hidden word, one letter at a time.");
        System.out.println("You have 7 wrong attempts. Let's begin!");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String[] words = {
                "apple", "water", "train", "light", "phone", "paper", "glass", "table", "chair", "watch",
                "plant", "books", "class", "board", "mouse", "keyboard", "bottle", "shirt", "pants", "shoes",
                "cycle", "truck", "plane", "metro", "road", "river", "field", "house", "shop", "store",
                "money", "price", "offer", "bank", "card", "phone", "email", "group", "order", "visit",
                "write", "read", "speak", "study", "learn", "teach", "notes", "files", "chart", "print",
                "clock", "alarm", "sound", "music", "radio", "video", "photo", "movie", "stage", "drama",
                "happy", "smile", "laugh", "angry", "tired", "sleep", "dream", "fresh", "clean", "neat",
                "green", "white", "black", "brown", "blue", "cream", "stone", "steel", "paper", "cloth",
                "serve", "visit", "start", "stop", "check", "build", "carry", "drive", "reach", "plant"
        };
        int collection = words.length;
        int random_no = rd.nextInt(collection);
        String word = words[random_no];
//        System.out.println(word);
        word = word.toLowerCase();
        char[] strArray = word.toCharArray();
        int n = strArray.length;
        char[] show = new char[n];
        boolean[] result = new boolean[n];

        Arrays.fill(show, '-');
        System.out.print("The word: ");
        view(show);
        System.out.println();

        int attempt = 0, max_attempt = 7;
        boolean[] op;
        while (attempt < max_attempt) {
            System.out.println("\nAttempts left: " + (max_attempt - attempt));
            System.out.print("Enter your guess (single letter): ");

            char guess = sc.next().charAt(0);
            op = index(strArray, guess, result);
            for (int i = 0; i < n; i++) {
                if (op[i]) {
                    show[i] = strArray[i];
                } else {
                    show[i] = '-';
                }
            }
            boolean correctGuess = isPresent(strArray, guess);
            if (correctGuess) {
                System.out.println("✅ Good guess!");
            } else {
                System.out.println("❌ Wrong guess!");
                ++attempt;
            }
            boolean isComplete = isPresent(show, '-');
            if (!isComplete) {
                System.out.println("\n🎉 SUCCESS! You guessed the word: " + word.toUpperCase());
                return;
            } else {
                view(show);
            }
        }

        System.out.println("\nGame Over! The word was: " + word.toUpperCase());
        System.out.println("Better luck next time!");

    }

    static boolean[] index(char[] arr, char target, boolean[] result) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (!result[i]) {
                if (arr[i] == target) {
                    result[i] = true;
                }
            }
        }
        return result;
    }

    static boolean isPresent(char[] a, char target) {
        boolean result = false;
        for (char value : a) {
            if (value == target) {
                result = true;
                break;
            }
        }
        return result;
    }

    static void view(char[] arr) {
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
    }
}
