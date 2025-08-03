package COM.SUDHEER.JavaLab;
import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is a file writing example.");
            writer.close();

            FileReader reader = new FileReader("output.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e);
        }
    }
}
