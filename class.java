package COM.SUDHEER.ARRAYLIST;

class Acchi{
    public static void main(String[] args) {
        Runnable r = () -> {
           for(int i = 0 ; i < 12 ; i++){
               System.out.println("main");
           }
        };
        Thread th = new Thread(r);
        th.start();

    }
}