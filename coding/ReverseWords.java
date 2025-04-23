
public class ReverseWords {

    public static String reverseWords2(String sentence) {
        sentence = sentence.strip();

        String res = "";
        String curr = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) != ' ') {
                curr = sentence.charAt(i) + curr;
            } else {
                res = res + curr;
                if (res.charAt(res.length() - 1) != ' ') {
                    res = res + ' ';
                }
                curr = "";
            }
        }
        res += curr;
        return res;
    }

    public static String reverseWords1(String sentence) {
        sentence = sentence.trim();
        String[] words = sentence.split("\\s+");

        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {

        String sentence = "dileep       thoutam";
        System.out.println(reverseWords2(sentence));
        
    }

}

