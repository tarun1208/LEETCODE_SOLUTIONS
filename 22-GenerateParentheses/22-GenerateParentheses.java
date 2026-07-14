// Last updated: 7/14/2026, 5:39:45 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3        if(num1.equals("0")||num2.equals("0")){
4            return "0";
5        }
6        int arr[] = new int[num1.length()+num2.length()];
7
8        for (int i = num1.length()- 1; i >= 0; i--) {
9            for (int j = num2.length()- 1; j >= 0; j--) {
10                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
11                int p1 = i + j;
12                int p2 = i + j + 1;
13                
14                int sum = mul + arr[p2];
15
16                arr[p1] += sum / 10;
17                arr[p2] = sum % 10;
18            }
19        }
20        StringBuilder sb = new StringBuilder();
21        for (int p : arr) {
22            if (!(sb.length() == 0 && p == 0)) {
23                sb.append(p);
24            }
25        }
26        return sb.toString();
27    }
28}