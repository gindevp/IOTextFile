import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class demo {
    public static void main(String[] args) throws IOException {
        File file= new File("demo.txt");
//        String[] arr = new String[4];
//        arr[0] = "mot";
//        arr[1] = "hai";
//        arr[2] = "ba";
//        arr[3] = "bon";
//        try {
//            if(file.exists()){
//                throw new FileAlreadyExistsException(file.toString());
//            }else {
//                throw new FileNotFoundException();
//            }
//        } catch (FileAlreadyExistsException e) {
//            System.err.println("file đã tồn tại cấm đè");
//            System.exit(1);
//        } catch (FileNotFoundException e){
//            System.err.println("file rỗng");
//        }
//        OutputStream outputStream= new FileOutputStream(file);
//        OutputStreamWriter writer= new OutputStreamWriter(outputStream);
//        BufferedWriter bufferedWriter= new BufferedWriter(writer);
//        for (String x:arr
//             ) {
//            bufferedWriter.write(x);
//            bufferedWriter.write("\n");
//            bufferedWriter.flush();
//        }
InputStream inputStream= new FileInputStream(file);
InputStreamReader reader= new InputStreamReader(inputStream);
BufferedReader bufferedReader= new BufferedReader(reader);
String line=null;

while ((line=bufferedReader.readLine())!=null){
    System.out.println(line);
}
bufferedReader.close();
reader.close();
inputStream.close();
    }
}
