import java.util.*;

class LCQ2062 {
    public static int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                if (isVowel(ch)) {
                    set.add(ch);
                    if (set.size() == 5) {
                        count++;
                    }
                } else {
                    break; // Non-vowel encountered, stop this substring
                }
            }
        }

        return count;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}