package DataStructre.Sliding_window;

class Minimum_Window_Subsequence {
    public String minWindow(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        int minLen = Integer.MAX_VALUE;
        int start = -1;

        int i = 0;

        while (i < n) {

            int j = 0;

            // Forward scan
            while (i < n) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j++;
                    if (j == m)
                        break;
                }
                i++;
            }

            if (i == n)
                break;

            int end = i;

            // Backward scan
            j = m - 1;

            while (j >= 0) {
                if (s1.charAt(i) == s2.charAt(j))
                    j--;
                i--;
            }

            i++; // Actual start of window

            if (end - i + 1 < minLen) {
                minLen = end - i + 1;
                start = i;
            }

            // Continue searching
            i = i + 1;
        }

        return start == -1 ? "" : s1.substring(start, start + minLen);
    }
}
