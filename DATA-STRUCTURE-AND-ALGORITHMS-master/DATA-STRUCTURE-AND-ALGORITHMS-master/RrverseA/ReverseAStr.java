import java.util.Scanner;

class ReverseAStr{
    public static String Solution(String R){
        String[] str = R.split("\\s");
        String U = " ";
        for(int i=str.length-1; i>=0; i--){
            U +=str[i];
            U +=" ";
        }
        return U.trim().replaceAll( " + " , " ");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String R = sc.nextLine();
        String output = Solution(R);
        System.out.println(output);
    }
}