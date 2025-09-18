package COM.SUDHEER.ARRAYLIST;

class GoodClass{
    public static void main(String[] args) {
        Thread th = new Thread(){
            public void run(){
                
                System.out.println("main thread");
            }
        };
        th.start();
                
    }

}
