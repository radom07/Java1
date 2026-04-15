public class Task15 {
    public static void main(String[] args) {
        System.out.print("Enter the sentence: ");
        String sentence = Input.sc.nextLine();

        String[] sentenceParts = sentence.split(" ");
        for (String part : sentenceParts) {
            System.out.println(part);
        }
    }
}
