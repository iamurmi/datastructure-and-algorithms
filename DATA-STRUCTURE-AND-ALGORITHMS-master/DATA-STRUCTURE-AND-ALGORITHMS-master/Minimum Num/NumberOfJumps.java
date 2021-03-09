import java.util.Scanner;
public class NumberOfJumps{
    public static void Solve(int[] R){
        int i = 0;
        int jump = 0;
        while(i<R.length-i){
            if(i+2 < R.length && R[i+2]==0){
                i = i+2;
                jump++;
            }
            else{
                i++;
                 jump++;
            }
        }
        System.out.println(jump);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int R[] = new int[n];
        for(int j=0; j<n; j++){
            R[j] = sc.nextInt();
        }
        Solve(R);
       
    } 
}