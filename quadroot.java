import java.util.Scanner;
public class quadroot {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("enter the 3 coefficients");
        int a= inp.nextInt();
        int b= inp.nextInt();
        int c= inp.nextInt();
        double d=(b*b)-(4*a*c);
        if(d>0){
            System.out.println("Real and Unique Solution");
            double r1= (-b+ Math.sqrt(d))/(2*a);
            double r2= (-b- Math.sqrt(d))/(2*a);
            System.out.println("r1="+r1+" r2="+r2);
        }
        else if(d==0){
            System.out.println("Real and Equal Solution");
            double root=(-b)/(2*a);
            System.out.println("r1=r2="+root);
        }
        else{
            System.out.println("No Real only imaginary solution");
            double r1=(-b)/(2*a);
            double r2=(Math.sqrt(-1*d))/(2*a);
            System.out.println("r1 ="+r1+" + i"+r2);
            System.out.println("r1 ="+r1+" - i"+r2);
        }
    }
}