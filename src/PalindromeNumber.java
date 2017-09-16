/**
 * Created by yangming on 17/9/16.
 */
public class PalindromeNumber {
    /**
     * 9. Palindrome Number
     * 确认一个整型是否为回文数，不使用额外的空间完成
     * ps:负数不是回文数
     * my code
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        int y = x;
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE || result < 0) {
                return false;
            }
            x = x / 10;
        }
        if (y != result) {
            return false;
        }
        return true;
    }

    /**
     * others' code
     *
     * @param x
     * @return
     */
    public boolean palindrome(int x) {
        if (x < 0 || x % 10 == 0) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        palindromeNumber.isPalindrome(1);
    }
}
