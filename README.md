# Java_assignment_week2
### 1.Using inheritance, one class can acquire the properties of others. Consider the following Animal class:
### class Animal{
###     void walk(){
###         System.out.println("I am walking");
###     }
### }
### This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:
### class Bird extends Animal {
###     void fly() {
###         System.out.println("I am flying");
###     }
### }


### Finally, we can create a Bird object that can both fly and walk.
### public class Solution{
###    public static void main(String[] args){
###       Bird bird = new Bird();
###       bird.walk();
###       bird.fly();
###    }
### }

## CODE:
~~~
public class animal {
    public void walk(){
        System.out.println("I m walking");
    }
}
public class bird extends animal{
    public void fly(){
        System.out.print("I m flying");
    }
    public void sing(){
        System.out.print(" "+"I m singing");
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        bird Bd= new bird();
        Bd.walk();
        Bd.fly();
        Bd.sing();
    }
}
~~~

## OUTPUT
![image](https://user-images.githubusercontent.com/93427264/226088152-ccb794eb-b79c-499a-a236-a570fd2d99a2.png)

### 2. Create a class named 'Member' having the following members:
### Data members
### 1 - Name
### 2 - Age
### 3 - Phone number
### 4 - Address
### 5 - Salary
### It also has a method named 'printSalary' which prints the salary of the members.
### Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' ### ### ### respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

### CODE:
~~~
public class member {
    public void name(String a){

        System.out.println("Name: "+a);
    }
    public void Age(int age){

        System.out.println("Age: "+age);
    }
    public void Number(int num){

        System.out.println("Phone Number: "+num);
    }
    public void Address(String adr){

        System.out.println("Address: "+adr);
    }
    public void Salary(int sal){

        System.out.println("Salary: "+sal);
    }
}
public class Manager extends member{
    public void department(String dept){

        System.out.println("Department: "+dept);
    }
}
~~~
### OUTPUT:


###  3.Write a program that would print the information (name, year of joining, salary, ###  address) of three employees by creating a class named 'Employee'. The output should ###  be as follows:
###  Name        Year of joining        Address
###  Robert            1994                64C- WallsStreat
###  Sam                2000                68D- WallsStreat
###  John                1999                26B- WallsStreat
### CODE:
~~~
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
public class Employee extends member{
    String Name[]=new String[20];
    int year[]=new int[50];
    String addr[]=new String[20];
}
~~~
### OUTPUT:
![image](https://user-images.githubusercontent.com/93427264/226090254-9df10bd8-e285-4f19-a21e-81242bfee6e3.png)

### 4.Define a method to calculate power of a number raised to other i.e. ab using recursion where the numbers 'a' and 'b' are to be entered by the user
### CODE:
~~~
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

~~~
### OUTPUT:
![image](https://user-images.githubusercontent.com/93427264/226099195-e930f66f-8e71-4b39-8e2d-10c1c92b31a5.png)
