
class _3Palindrome {
    public static boolean isPalindrone(String str){
        int n = str.length();
        for(int i = 0 ;i<n/2;i++){
            if(str.charAt(i)!= str.charAt(n-i-1)){
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
       String str = "cac" ;
       System.out.println(isPalindrone(str)) ;
    }
}