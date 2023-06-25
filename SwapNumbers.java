import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int [] numbers=new int[2];
        System.out.print("Enter Number 1 :");
        numbers[0]=obj.nextInt();
        System.out.print("Enter Number 2 :");
        numbers[1]=obj.nextInt();
        swap(numbers);
        System.out.println("Number 1 is : "+numbers[0]);
        System.out.println("Number 2 is : "+numbers[1]);
        obj.close();
    }

    private static void swap(int []num){
        num[0]=num[0]+num[1];
        num[1]=num[0]-num[1];
        num[0]=num[0]-num[1];
    }
}
