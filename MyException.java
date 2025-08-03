package COM.SUDHEER.JavaLab;
class MyException{
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30 , 40};
        int []arr2 = {1,0,3,4};
        for(int i = 0 ; i < 4 ; i++){
            try{
                int res = arr[i]/arr2[i];
                System.out.println(res);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
