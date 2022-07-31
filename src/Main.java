import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter= new FileWriter("number.txt");
        fileWriter.write("5"+"5\n"+"5\n"+"5\n");
        fileWriter.close();
        System.out.println("nhập:");
        Scanner scanner= new Scanner(System.in);
        String path= scanner.nextLine();
        readFileExample readFileexample= new readFileExample();
        readFileexample.readFileText("number.txt");
    }
}
