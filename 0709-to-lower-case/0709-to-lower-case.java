class Solution {
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();  

        for (int i = 0; i < ch.length; i++) {
           
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char)(ch[i] - 'A' + 'a');
            }
        }

        return new String(ch);  
    }
}
