public class BuySell{
    public static void main(String[]args){
        int array[] = {5,20,30,80,90};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            int CurrentValue=array[i];
            if(CurrentValue<min){
                min=CurrentValue;
            }
            if(CurrentValue-min>max){
                max=CurrentValue-min;
            }
        }
        System.out.println("Max Value="+max);
    }
}