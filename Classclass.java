package COM.SUDHEER.ARRAYLIST;
sealed class Student permits Ram{
    void SayHello(){
        System.out.println("hello");
    }
}
non-sealed class Ram extends Student{

}
class MeriClass{
    public static void main(String[] args) {
        Ram obj = new Ram();
         obj.SayHello();
    }
}