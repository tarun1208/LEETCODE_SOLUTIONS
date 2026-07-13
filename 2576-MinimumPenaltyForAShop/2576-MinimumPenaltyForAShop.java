// Last updated: 7/13/2026, 12:09:01 PM
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