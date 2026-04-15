public class Task13 {
    public static void main(String[] args) {
        System.out.print("Enter the sentence: ");
        String sentence = Input.sc.nextLine();

        String replacedSpaces = sentence.replaceAll(" ", "_");
        System.out.println("Sentence with spaces replaced with underscores: " + replacedSpaces);

        String cleanedString = replacedSpaces.replaceAll("_", "");
        System.out.println("Sentence with underscores removed: " + cleanedString);
    }
}
