class Solution {
    public char repeatedCharacter(String s) {
        int CHAR = 256;
        int[] count = new int[CHAR];  

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch]++;
            if (count[ch] == 2) {
                return ch; 
            }
        }
        
        return '\0';
    }
}
