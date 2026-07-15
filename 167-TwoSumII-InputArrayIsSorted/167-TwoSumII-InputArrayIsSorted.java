// Last updated: 7/15/2026, 9:58:39 AM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int n = numbers.length;
4        int start = 0;
5        int end = n-1;
6        int sum = 0;
7        int arr[] = new int[2];
8        while(start<end){
9            sum = numbers[start]+numbers[end];
10            if(sum == target){
11                arr[0] = start+1;
12                arr[1] = end+1;
13                return arr;
14            }
15            else if(sum>target){
16                end--;
17            }else{
18                start++;
19            }
20        }
21        return arr;
22    }
23}