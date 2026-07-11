class Solution {
    public int trap(int[] height) {
        int ans=0,l=0,r=height.length-1;
        int lmax=height[0],rmax=height[r];
        while(l<=r){
            if(lmax<rmax){
                lmax=Math.max(lmax,height[l]);
                int v=Math.min(lmax,rmax)-height[l];
                ans+=v<0?0:v;
                l++;
            }
            else{
                rmax=Math.max(rmax,height[r]);
                int v=Math.min(lmax,rmax)-height[r];
                ans+=v<0?0:v;
                r--;
            }
        }
        return ans;
    }
}
