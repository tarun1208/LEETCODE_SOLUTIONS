// Last updated: 7/13/2026, 12:12:35 PM
class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if (numRows == 1 || n <= numRows)
            return s;

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int row = 0;
        boolean down = true;
        for (int i = 0; i < s.length(); i++) {
            rows[row] = rows[row] + s.charAt(i);

            if (down)
                row++;
            else
                row--;

            if (row == numRows - 1)
                down = false;
            if (row == 0)
                down = true;
        }

        String result = "";
        for (int i = 0; i < numRows; i++) {
            result = result + rows[i];
        }

        return result;
    }
}