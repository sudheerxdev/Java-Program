package COM.SUDHEER.JavaLab;
class Student{
    String name ;
    int age ;
    Student(int age , String name)
    {
        this.age = age ;
        this.name = name;
    }
    public void Display()
    {
        System.out.println("the age of student is :" + age);
        System.out.println("the name of student is : " + name);
    }
}
class Demo{
    public static void main(String[] args) {
        Student st = new Student(20 , "sudheer");
        st.Display();
    }
}