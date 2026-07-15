// Last updated: 7/15/2026, 10:32:03 AM
1import java.util.ArrayList;
2import java.util.Arrays;
3import java.util.List;
4
5class Solution {
6    public List<List<Integer>> threeSum(int[] nums) {
7        List<List<Integer>> result = new ArrayList<>();
8        int n = nums.length;
9        Arrays.sort(nums); 
10
11        for (int i = 0; i < n - 2; i++) {
12            if (i > 0 && nums[i] == nums[i - 1]) {
13                continue;
14            }
15            int left = i + 1;
16            int right = n - 1;
17            while (left < right) {
18                int sum = nums[i] + nums[left] + nums[right];
19
20                if (sum == 0) {
21                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
22
23                    while (left < right && nums[left] == nums[left + 1]) {
24                        left++;
25                    }
26
27                    while (left < right && nums[right] == nums[right - 1]) {
28                        right--;
29                    }
30                    
31                    left++;
32                    right--;
33                } 
34                else if (sum < 0) {
35                    left++;
36                } else {
37                    right--;
38                }
39            }
40        }        
41        return result;
42    }
43}