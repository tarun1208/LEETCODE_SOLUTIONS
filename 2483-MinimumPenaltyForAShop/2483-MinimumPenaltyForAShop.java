// Last updated: 9/4/2026, 9:01:02 PM
class Solution {
    public int bestClosingTime(String customers) {
        int maxScore = 0;
        int score = 0;
        int bestHrs = 0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                score +=1;
            }else{
                score -=1;
            }
            if(score>maxScore){
                maxScore = score;
                bestHrs = i+1;
            }
        }
        return bestHrs;
    }
}