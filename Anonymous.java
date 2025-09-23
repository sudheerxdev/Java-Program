package COM.SUDHEER.ARRAYLIST;

class Good{
    public static void main(String[] args) {
        Runnable r = new Runnable() {
          public void run(){
              for(int i = 1 ; i < 10 ; i++){
                  System.out.print( i + " " );
              }
          }
        };
        Thread th = new Thread(r);
        th.start();
    }

}
