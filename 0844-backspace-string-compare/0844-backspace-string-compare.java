class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder H = new StringBuilder();
        StringBuilder R = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != '#') {
                H.append(ch);
            } else if (H.length() > 0) {
                H.deleteCharAt(H.length() - 1);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch != '#') {
                R.append(ch);
            } else if (R.length() > 0) {
                R.deleteCharAt(R.length() - 1);
            }
        }

        return H.toString().equals(R.toString());
    }
}