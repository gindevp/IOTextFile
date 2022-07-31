import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> number= new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br= new BufferedReader(new FileReader(file));
            String line=null;
            while ((line= br.readLine())!=null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File k tồn tại");

    }
        return number;

}
public  void writeFile(String filePath, int max){
        try {
            FileWriter writer= new FileWriter(filePath,true);
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất :"+max);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
}
}
