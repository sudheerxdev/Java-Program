class Solution {
  public:
    int arraySum(int arr[], int size) {
        // Code here
        int sum= 0;
        for(int i = 1 ; i < size ; i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr[size-1];
    }
};
