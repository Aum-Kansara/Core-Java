import java.util.Arrays;
public class Overloading{
    static void print(int a){
        System.out.println(a);
    }
    static void print(String a){
        System.out.println(a);
    }
    static int print(int a,String b){
        System.out.println(a);
        System.out.println(b);
        return 0;
    }
    static void printAll(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void printAll(String ...b){
        System.out.println(Arrays.toString(b));
    }
    public static void main(String [] args){
        print(34);
        print("Hello");
        print(12,"Hello");
        printAll(2,3,4,5,6);
        printAll("Jell","Compass","Thor");
        // printAll(); Ambiguous printAll() Function. Compiler not able to decide which printAll() function to run
    }
}