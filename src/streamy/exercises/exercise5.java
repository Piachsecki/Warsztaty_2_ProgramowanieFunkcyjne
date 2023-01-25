package streamy.exercises;

public class exercise5 {

    public static void main(String[] args) {
        String str = "aja                                                                                                           ";
        String noSpace = str.replace(" ", "");
        System.out.println("The given string: "+noSpace+"" + isPalindrome(noSpace) );

    }

    private static boolean isPalindrome(String noSpace) {
        String reverse = noSpace.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (ch1, ch2) -> ch2 + ch1);

        return noSpace.equals(reverse);

    }
}
