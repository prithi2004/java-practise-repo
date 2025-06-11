
import java.util.Scanner;

public class Removevowels{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                continue;  
        }
            System.out.print(str.charAt(i)); 
        }
        
    }
}