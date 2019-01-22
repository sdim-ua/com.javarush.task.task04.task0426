import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int numb = Integer.parseInt(reader.readLine());
        
        if(numb == 0){
            System.out.println("0");
        }
        else  if (numb < 0 && numb % 2 == 0 ){
            System.out.println("отрицательное четное число");
        }
        else if (numb < 0 && numb % 2 != 0 ){
            System.out.println("отрицательное нечетное число");
        }
       
        else if (numb > 0 && numb % 2 == 0 ){
            System.out.println("положительное четное число");
        }
        else if (numb > 0 && numb % 2 != 0 ){
            System.out.println("положительное нечетное число");
        }
         
    }
    
}
