import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Employee emp= new Employee();
        for(int i=0;i<3;i++)
        {
            emp.Name[i]=sc.next();
            emp.year[i]=sc.nextInt();
            emp.addr[i]=sc.next();
        }
        System.out.println("Name           Year of joining           Address");
        for(int i=0;i<3;i++)
        {
            System.out.println(emp.Name[i]+"\t\t\t\t"+"  "+emp.year[i]+"\t\t\t\t"+emp.addr[i]);
        }
    }
}