/**
 * Created by yangming on 17/9/16.
 */
public class LongestCommonPrefix {
    /**
     * Longest Common Prefix
     * Write a function to find the longest common prefix string amongst an array of strings.
     * <p>
     * 思路：先假设String数组的第一个为最长相同前缀，然后循环遍历整个数组，拿前一次得到的最长相同前缀去做比较，最后得出结果
     *
     * @param s
     * @return
     */
    public String longesCommonPrefix(String[] s) {
        String result = s.length == 0 ? "" : s[0];
        for (int i = 0; i < s.length; i++) {
            result = getResult(result, s[i]);
        }
        return result;
    }

    public String getResult(String from, String to) {
        StringBuffer sb = new StringBuffer();
        int length = from.length() > to.length() ? to.length() : from.length();
        for (int j = 0; j < length; j++) {
            if (from.charAt(j) == to.charAt(j)) {
                sb.append(from.charAt(j));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longesCommonPrefix(new String[]{"123421", "1234256", "12342901", "123982341"}));
    }
}
