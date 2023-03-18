package q4;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=power(a,b);
        System.out.println("Ans: "+result);
    }
    public static int power(int a,int b){
        if(b>0) {
            return a * power(a, b-1);
        }
        else{
            return 1;
        }
    }
}
