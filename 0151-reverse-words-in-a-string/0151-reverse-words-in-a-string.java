class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");

        char[] str = s.toCharArray();
        int n = str.length;
        int start=0;

        for(int end=0; end<n; end++){
            if(str[end]==' '){
                reverse(str,start,end-1);
                start = end + 1;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);

        return new String(str);

    }

        private void reverse(char s[], int start, int end){
            while(start<end){
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--; 
            }
        }

}