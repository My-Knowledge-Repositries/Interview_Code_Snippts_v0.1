import java.io.FileInputStream;

public class TryCatch {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("text.txt");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
