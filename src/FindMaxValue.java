import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> number){
        int max= number.get(0);
        for(int i=0;i<number.size();i++){
            if(max<number.get(i)){
                max= number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
    ReadAndWriteFile readAndWriteFile= new ReadAndWriteFile();
    List<Integer> number= readAndWriteFile.readFile("number.txt");
    int maxValue= findMax(number);
    readAndWriteFile.writeFile("result.txt",maxValue);
    }
}
