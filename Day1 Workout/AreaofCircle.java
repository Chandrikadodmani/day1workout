import java.util.Scanner;
class AreaofCircle {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        double r= sc.nextDouble();
        double area =Math.PI * r * r;
        System.out.println("Area = " +area);
    }
}