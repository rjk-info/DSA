/*
 * LeetCode 125: Valid Palindrome
 * 
 */

class LCQ125 {
    public boolean isPalindrome(String s) {
        
        StringBuilder cleaned = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }
        String str = cleaned.toString(); 
        int n = str.length();
        for(int i = 0 ;i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true ;
    }
}