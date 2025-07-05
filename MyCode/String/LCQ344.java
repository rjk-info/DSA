// program to reverse a string in place
// Reverse a string

class LCQ344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1 ;
       
       while(left<right){
        char temp = s[left] ;
        s[left] = s[right] ;
        s[right] = temp;

        left++ ;
        right-- ;
       }
    }
}