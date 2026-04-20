class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length ; 
        int [] flag = new int[n];
        int j ;
        for(int i = 0 ; i < n ; i++){
            int max = Integer.MIN_VALUE;
            int maxindex = i;
            for(j = i + 1 ; j < n ; j++){
                if(arr[j]>max){
                    max = Math.max(max , arr[j]);
                    maxindex = j;
                }
            }
            flag[i]=maxindex;
        }
        int []ans = new int[n];
        for(int i = 0 ; i < n - 1; i++){
            ans[i]= arr[flag[i]];
        }
        ans[n - 1] = -1;
        return ans;
    }
}
