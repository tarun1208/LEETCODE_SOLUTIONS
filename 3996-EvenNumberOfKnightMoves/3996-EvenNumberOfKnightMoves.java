// Last updated: 9/4/2026, 8:59:07 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        return (start[0]+start[1])%2 == (target[0]+target[1])%2;
    }
}