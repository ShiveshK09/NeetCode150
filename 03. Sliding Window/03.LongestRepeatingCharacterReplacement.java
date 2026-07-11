class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0,l=0,max=0;
        int[] ch=new int[26];
        for(int r=0;r<s.length();r++){
            max=Math.max(max,++ch[s.charAt(r)-'A']);
            while((r-l+1)-max>k)
            max=Math.max(max,ch[s.charAt(l++)-'A']--);
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
