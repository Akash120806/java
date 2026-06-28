class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int[] arr = new int[26];
        int left =0 ;
        int len =0;
        int maxlen=0;
        int unc=0;
        for(int right=0;right<s.length();right++)
        {
            int index=s.charAt(right)-97;
            if(arr[index]==0){
                unc++;
            }
            arr[index]++;
            if(unc==k){
                len=right-left+1;
                maxlen=Math.max(maxlen, len);
            }
            if(unc>k){
                while(left<=right&& unc>k){
                     index=s.charAt(left)-97;
                    arr[index]--;
                    left++;
                    if(arr[index]==0){
                        unc--;
                    }
                }
            }
        }
        return (maxlen==0)?-1:maxlen;
        
    }
}