// Last updated: 9/4/2026, 9:00:42 PM
import java.util.*;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum =0;
        for(int i=0;i<apple.length;i++){
            sum += apple[i];
        }
        int boxes = 0;
        for (int j = capacity.length - 1; j >= 0; j--) {
            sum -= capacity[j];
            boxes++;
            if (sum <= 0) {
                return boxes;
            }
        }
        return boxes;



        // int i = capacity.length - 1;
        // int usedBoxes = 1;
        // for (int j = 0; j < apple.length; j++) {

        //     capacity[i] -= apple[j];
        //     if (capacity[i] < 0) {
        //         i--;            
        //         usedBoxes++;
        //         capacity[i] -= apple[j];
        //     }
        // }

        // return usedBoxes;
    }
}
