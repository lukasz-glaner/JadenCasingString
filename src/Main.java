public class Main {

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase(String phrase) {
        String result = "";
        if (phrase == null || phrase.isEmpty()) {
            return null;
        } else {
            String[] words = phrase.split(" ");

            for (String word : words
            ) {
                String newWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                result = result + newWord + " ";
            }
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }
}
