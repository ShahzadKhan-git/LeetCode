class Solution {
    public int longestPalindrome(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                lower[ch - 'a']++;
            }else{
                upper[ch - 'A']++;
            }
        }

        int count =0;
        boolean odd = false;

        for(int i=0; i<26; i++){
            if(lower[i]%2==0){
                count += lower[i];
            }else{
                count += lower[i] -1;
                odd = true;
            }

             if(upper[i]%2==0){
                count += upper[i];
            }else{
                count += upper[i] -1;
                odd = true;
            }
        }
         if(odd) count += 1;

         return count;
    }
}