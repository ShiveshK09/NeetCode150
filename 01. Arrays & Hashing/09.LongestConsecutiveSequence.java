class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int ans=0;
        for(int n:nums)set.add(n);
        for(int n:set){
            if(!set.contains(n-1)){
                int len=1;
                while(set.contains(n+len)) len++;
                ans=Math.max(ans,len);
            }
        }
        return ans;
    }
}
