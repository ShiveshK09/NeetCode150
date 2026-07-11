class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int[] a1=new int[26];
        int[] a2=new int[26];
        for(char c:s1.toCharArray()) a1[c-'a']++;
        for(int i=0;i<n;i++){
            a2[s2.charAt(i)-'a']++;
            if(i>=m) a2[s2.charAt(i-m)-'a']--;
            if(Arrays.equals(a1,a2)) return true;
        }
        return false;
    }
}
