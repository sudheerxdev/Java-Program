package COM.SUDHEER;
class MyException extends Thread{
    public void run(){
        for(int i = 0 ; i < 112 ; i++){
            System.out.println("thread - 1");
        }
    }
}
class Main{
    public static void main(String[] args) {
        MyException obj = new MyException();
        obj.start();
        for(int j = 0 ; j < 123 ; j++){
            System.out.println("main thread ");
        }
    }
}