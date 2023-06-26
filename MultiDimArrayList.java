import java.util.ArrayList;
public class MultiDimArrayList{
    public static void main(String [] args){
        ArrayList<ArrayList<String>> outer=new ArrayList<>();
        for(int i=0;i<3;i++)
            outer.add(new ArrayList<>());
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                outer.get(i).add(Integer.toString(i+j));
        }

        for(int i=0;i<3;i++){
            System.out.println(outer.get(i));
        }

    }
}