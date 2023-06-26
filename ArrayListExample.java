import java.util.ArrayList;
public class ArrayListExample{
    public static void main(String [] args){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}