import java.util.Scanner;
public class Counter{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        long num1=obj.nextInt();
        int counter=0;
        while(num1>0){
            if(num1%10==7) counter++;
            num1=num1/10;
        }
        System.out.println(counter);
    }
}