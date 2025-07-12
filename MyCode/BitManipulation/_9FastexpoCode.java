public class _9FastexpoCode {
    // Function to perform fast exponentiation

    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n > 0) {
            if((n & 1) != 1) {
                ans = a * a;
            }
            a = a * a;
            n = n >> 1; // Right shift n by 1 bit
        }
            return ans;
        }

    public static void main(String[] args) {
        System.out.println(fastExpo(2, 10)); // Example usage
    }
}
