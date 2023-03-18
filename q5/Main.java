package q5;
public class Main {
    public static void main(String [] args){
        int r1,r2,c1,c2;
        int [][]Arr1;
        int [][]Arr2;
        Matrix m=new Matrix();
        System.out.println("Enter no of rows for matrix 1: ");
        r1=m.rows();
        System.out.println("Enter no of columns for matrix 1: ");
        c1=m.columns();
        System.out.println("Enter no of rows for matrix 2: ");
        r2=m.rows();
        System.out.println("Enter no of columns for matrix 2: ");
        c2=m.columns();
        Arr1=m.setmatix(r1,c1);
        Arr2=m.setmatix(r2,c2);
        System.out.println("Sum of two matrics: ");
        m.add(Arr1,Arr2,r1,c1,r2,c2);
        System.out.println("Product of two matrics: ");
        m.product(Arr1,Arr2,r1,c1,r2,c2);
    }
}
