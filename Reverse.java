import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num1=obj.nextInt();
        int rev=0;
        while(num1>0){
            rev=(rev*10)+num1%10;
            num1=num1/10;
        }
        System.out.println(rev);
    }
}