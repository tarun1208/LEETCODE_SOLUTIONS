// Last updated: 7/13/2026, 12:09:07 PM
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int[] count = new int[n]; 
        long[] rooms = new long[n];  
        Arrays.sort(meetings, (a, b) -> a[0] == b[0] ? 
                   Integer.compare(a[1], b[1]) : 
                   Integer.compare(a[0], b[0]));

        for(int[] meeting : meetings){ 
            long start = meeting[0];
            int pos = -1;
            long min = Long.MAX_VALUE;

            for(int j = 0; j < n; j++){
                if(rooms[j] <= start){  
                    pos = j;
                    break;
                }
                if(rooms[j] < min){    
                    pos = j;
                    min = rooms[j];
                }
            }
            
            count[pos]++;
            if(rooms[pos] <= start){ 
                rooms[pos] = meeting[1]; 
            } else {
                rooms[pos] += meeting[1] - meeting[0]; 
            }
        }

        int max = -1, pos = -1;
        for(int i = 0; i < n; i++){
            if(count[i] > max){
                max = count[i];
                pos = i;
            }
        }
        return pos;
    }
}
