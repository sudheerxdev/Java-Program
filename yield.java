package COM.SUDHEER.ARRAYLIST;

class merimclass {
    public static void main(String[] args) {
         int res ;
         int n = 3 ;
         res =switch(1){
           case 1 , 2 -> {
               System.out.println("value of nn is " + n);
               yield 12;
           }
           case 3 -> 13;
           default -> 123;
         };
        System.out.println(res);
    }
}