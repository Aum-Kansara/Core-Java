import java.util.Arrays;
public class VarArgs{
    public static void main(String [] args){
        print(1,2,3,4,5,6);
        print();
    }
    static void print(int ...d){
        System.out.println(Arrays.toString(d));
    }
}