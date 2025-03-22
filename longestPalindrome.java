
class Solution {

    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int result = 0;

        if (s.length() == 1) {
            return 1;
        }

        for (char chr : s.toCharArray()) {
            if (set.contains(chr)) {
                set.remove(chr);
                result += 2;
            } else {
                set.add(chr);
            }
        }

        if (!set.isEmpty()) {
            result += 1;
        }

        return result;
    }
}
