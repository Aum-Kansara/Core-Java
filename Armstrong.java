public class Armstrong{
    public static void main(String [] args){
        for(int i=100;i<1000;i++){
            if(isArmstrong(i))
                System.out.println(i);
        }
    }
    
    static boolean isArmstrong(int num){
        int sum=0,rem,temp=num;
        while(temp>0){
            rem=temp%10;
            sum+=(rem*rem*rem);
            temp/=10;
        }
        return sum==num;
    }
}