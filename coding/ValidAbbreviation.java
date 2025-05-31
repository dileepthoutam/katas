
public class ValidAbbreviation {

    public static boolean validAbbreviation(String word, String abbr) {
        int start = 0;
        int end = word.length() - 1;

        int p = 0;
        int q = abbr.length() - 1;

        while (start <= end && word.charAt(start) == abbr.charAt(p)) {
            start++;
            p++;
        }
        while (start <= end && word.charAt(end) == abbr.charAt(q)) {
            end--;
            q--;
        }

        return (end - start + 1) == abbr.charAt(p) - '0';
    }

    public static void main(String[] args) {

        String word = "innoation";
        String abbr = "in5ion";

        System.out.println(validAbbreviation(word, abbr));
        
    }
}

