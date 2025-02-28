// 6 ms, IN
class Solution {

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String getReverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append(c);
            }
        }
        String rev = getReverse(sb.toString());
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                ans.append(rev.charAt(idx++));
            } else {
            ans.append(c);
            }
        }
        return ans.toString();
    }
}

// 4 ms, US
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        List<Integer> indexes = new ArrayList<>();
        char[] chars = s.toCharArray();
        int i = 0;

        for (char c : s.toCharArray()) {
            if (isAVowel(c)) {
                sb.append(c);
                indexes.add(i);
            }
            i++;
        }

        i = indexes.size() - 1;

        for (int index: indexes) {
            chars[index] = sb.charAt(i--);
        }

        return new String(chars);
    }

    public boolean isAVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
