/**
 * Created by yangming on 17/9/16.
 */
public class RomanToInteger {
    /**
     * Given a roman numeral, convert it to an integer.
     * Input is guaranteed to be within the range from 1 to 3999.
     * 了解罗马数字如何转换成阿拉伯数字，找规律，for循环遍历整个String，最后相加得出的值即为答案
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    result[i] = 1;
                    break;
                case 'V':
                    result[i] = 5;
                    break;
                case 'X':
                    result[i] = 10;
                    break;
                case 'L':
                    result[i] = 50;
                    break;
                case 'C':
                    result[i] = 100;
                    break;
                case 'D':
                    result[i] = 500;
                    break;
                case 'M':
                    result[i] = 1000;
                    break;
            }
        }
        int sum = 0;
        for (int j = 0; j < result.length - 1; j++) {
            if (result[j] < result[j + 1]) {
                sum -= result[j];
            } else {
                sum += result[j];
            }
        }
        sum = sum + result[result.length - 1];
        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCDXLIX"));
    }
}
