// Last updated: 7/20/2026, 10:30:15 AM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        return (start[0]+start[1])%2 == (target[0]+target[1])%2;
    }
}