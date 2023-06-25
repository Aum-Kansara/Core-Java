import java.util.Scanner;
public class Fibonaki{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Value of N :");
        int num1=obj.nextInt();
        int a=0,b=1,c;
        for(int i=0;i<num1-1;i++){
            c=b;
            b=a+b;
            a=c;
        }
        System.out.println(b);
        obj.close();
    }
}