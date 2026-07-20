// Last updated: 7/20/2026, 10:30:23 AM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ys = new StringBuilder();
        StringBuilder xs = new StringBuilder();
        StringBuilder o = new StringBuilder();

        for(int i=0;i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch==y){
                ys.append(ch);
            }else if(ch == x) {
                xs.append(ch);
            }else{
                o.append(ch);
            }
        }
        return ys.append(o).append(xs).toString();
    }
}