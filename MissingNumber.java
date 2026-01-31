package InterviewPractice31jan;

class MissingNumber{
    public static Integer MissingNumber(int[] arr , int n){
        int sum = 0 ;
        int totalSum = n*(n +1)/2;
        for(int i =0 ;i<arr.length;i++){
            sum += arr[i];
        }
        return totalSum - sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9};
        int n = 9;
        int res ;
        res = MissingNumber(arr , n);
        System.out.println(res);
    }
}