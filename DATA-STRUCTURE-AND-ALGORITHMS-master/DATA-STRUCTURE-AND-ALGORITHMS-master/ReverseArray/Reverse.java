public class Reverse{
    public static void main(String[]args){
        int Arr[] = {10,20,30,40};
        int low=0;
        int high=Arr.length-1;
        while(low<high){
            int temp=Arr[low];
            Arr[low]=Arr[high];
            Arr[high]=temp;
            low++;
            high--;
        }
        for(int i : Arr){
            System.out.println(i);
        }
    }
}