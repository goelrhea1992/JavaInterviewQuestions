/** Question picked from Leetcode
    Given a sorted integer array without duplicates, return the summary of its ranges.
    For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
**/

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> summaryRanges = new ArrayList();
        if (nums.length != 0) {
            int start, stop;
            start = stop = nums[0];
            
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i-1] + 1) {
                    stop = nums[i-1];
                    if (start == stop)
                        summaryRanges.add(String.valueOf(start));
                    else
                        summaryRanges.add(start + "->" + stop);
                    start = nums[i];
                }
                if (i == nums.length - 1)
                    stop = nums[i];
            }
            
            if (start == stop)
                summaryRanges.add(String.valueOf(start));
            else 
                summaryRanges.add(start + "->" + stop);
        }
        return summaryRanges;
    }
}
