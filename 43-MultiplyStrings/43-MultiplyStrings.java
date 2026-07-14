// Last updated: 7/14/2026, 9:34:20 PM
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int arr[] = new int[num1.length()+num2.length()];

        for (int i = num1.length()- 1; i >= 0; i--) {
            for (int j = num2.length()- 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                
                int sum = mul + arr[p2];

                arr[p1] += sum / 10;
                arr[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : arr) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }
        return sb.toString();
    }
}