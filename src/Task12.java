public class Task12 {
    public static void main(String[] args) {
        System.out.print("Enter the sentence: ");
        String sentence = Input.sc.nextLine();

        System.out.println("Enter the word to search for: ");
        String word = Input.sc.nextLine();

        boolean isWordPresent = sentence.contains(word);
        System.out.println("Is the word present in the sentence? " + isWordPresent);

        int wordIndex = sentence.indexOf(word);
        System.out.println("Index of the word: " + wordIndex);
    }
}
