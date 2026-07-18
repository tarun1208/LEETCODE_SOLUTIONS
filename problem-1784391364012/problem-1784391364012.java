// Last updated: 7/18/2026, 9:46:04 PM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder ys = new StringBuilder();
4        StringBuilder xs = new StringBuilder();
5        StringBuilder o = new StringBuilder();
6
7        for(int i=0;i<s.length(); i++){
8            char ch = s.charAt(i);
9            if(ch==y){
10                ys.append(ch);
11            }else if(ch == x) {
12                xs.append(ch);
13            }else{
14                o.append(ch);
15            }
16        }
17        return ys.append(o).append(xs).toString();
18    }
19}