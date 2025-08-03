package COM.SUDHEER.JavaLab;
class MyThread extends Thread{
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("child thread  ");
        }
    }

    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
        for(int i = 0 ;i < 5 ; i++){
            System.out.println("main thread  ");
        }
    }
}
