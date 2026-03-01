import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[]args){
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter Marks:");
       int Marks=sc.nextInt();
       if(Marks>=90){
        System.out.println("Distinction");
       }
    else if(Marks>=70 && Marks<=89){
        System.out.println("first class");
    }
    else {
        System.out.println("fail");
    }
}
    
}
