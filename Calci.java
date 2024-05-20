import java.util.Scanner;

interface Calci{
    int add(int a, int b);
}
class CalciImpl{
    int add(int x,int y){
        return x+y;
    }
}
class CalciDriver{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+" + "+b+" = "+new CalciImpl().add(a, b));
        sc.close();
    }
}