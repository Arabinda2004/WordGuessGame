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
        String[][] categorizedWords = {
                {"Fruits", "apple", "banana", "orange", "grape", "mango", "cherry", "peach", "berry", "lemon", "kiwi"},
                {"Vegetables", "carrot", "broccoli", "spinach", "tomato", "potato", "onion", "pepper", "lettuce", "corn", "beans"},
                {"Furniture", "table", "chair", "sofa", "bed", "desk", "shelf", "cabinet", "dresser", "bench", "stool"},
                {"Accessories", "watch", "glasses", "belt", "hat", "bag", "necklace", "bracelet", "ring", "scarf", "wallet"},
                {"Clothing", "shirt", "pants", "shoes", "jacket", "dress", "socks", "hat", "coat", "sweater", "shorts"},
                {"Colors", "red", "blue", "green", "yellow", "black", "white", "purple", "orange", "pink", "brown"},
                {"Vehicles", "car", "bike", "bus", "truck", "plane", "train", "boat", "motorcycle", "metro", "taxi"},
                {"Objects", "book", "pen", "phone", "computer", "bottle", "key", "mirror", "clock", "lamp", "camera"},
                {"Animals", "dog", "cat", "bird", "fish", "horse", "cow", "sheep", "lion", "tiger", "elephant"},
                {"Sports", "football", "basketball", "tennis", "cricket", "swimming", "running", "golf", "volleyball", "baseball", "hockey"},
                {"Food", "pizza", "burger", "pasta", "rice", "bread", "cheese", "meat", "fish", "soup", "salad"},
                {"Drinks", "water", "juice", "coffee", "tea", "milk", "soda", "wine", "beer", "smoothie", "lemonade"},
                {"Body Parts", "head", "hand", "foot", "eye", "ear", "nose", "mouth", "arm", "leg", "finger"},
                {"Weather", "sunny", "rainy", "cloudy", "windy", "stormy", "snowy", "hot", "cold", "warm", "humid"},
                {"Emotions", "happy", "sad", "angry", "excited", "worried", "calm", "surprised", "scared", "proud", "nervous"},
                {"School", "teacher", "student", "classroom", "homework", "test", "book", "pencil", "eraser", "ruler", "backpack"},
                {"Kitchen", "stove", "oven", "fridge", "microwave", "knife", "fork", "spoon", "plate", "bowl", "cup"},
                {"Technology", "computer", "laptop", "tablet", "smartphone", "keyboard", "mouse", "monitor", "printer", "router", "speaker"},
                {"Music", "piano", "guitar", "violin", "drums", "flute", "trumpet", "saxophone", "song", "rhythm", "melody"},
                {"Nature", "tree", "flower", "grass", "mountain", "river", "ocean", "forest", "desert", "valley", "beach"}
        };

        int randCatgInd = rd.nextInt(8);
        String randCatg = categorizedWords[randCatgInd][0].toUpperCase();
//        System.out.println(randCatg);

        int collection = categorizedWords[randCatgInd].length;
//        System.out.println(collection);
        int random_no = rd.nextInt(collection) + 1;
//        System.out.println(random_no);
        String word = categorizedWords[randCatgInd][random_no];
//        System.out.println(word);
        word = word.toUpperCase();
        char[] strArray = word.toCharArray();
        int n = strArray.length;
        char[] show = new char[n];
        boolean[] result = new boolean[n];

        System.out.println("Category: " + randCatg);
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
            guess = Character.toUpperCase(guess);
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
                System.out.println("🎉 SUCCESS! You guessed the word: " + word.toUpperCase());
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
