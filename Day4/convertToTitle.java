class Solution {
    public String convertToTitle(int columnNumber) {
        final StringBuilder sb = new StringBuilder();

        while (columnNumber-- > 0) {
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
