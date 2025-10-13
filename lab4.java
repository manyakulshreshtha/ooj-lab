import java.util.Scanner;
class Time{
    int hours;
    int minutes;

    Time(int hours,int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }

    Time Addtime(Time t1,Time t2){
        Time temp=new Time(0, 0);
        temp.hours=t1.hours+t2.hours;
        temp.minutes=t1.minutes+t2.minutes;
        if(temp.minutes>=60){
            temp.hours+=temp.minutes/60;
            temp.minutes=temp.minutes%60;
        }
        return temp;
    }
    
    void Display(){
        System.out.println("time: " +hours+" hours "+ minutes+ " minutes");
    }
}
public class lab4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Time t1= new Time(0,0);
        Time t2= new Time(0, 0);
        System.out.println("enter the hours ");
        t1.hours=sc.nextInt();
        System.out.println("enter the minutes ");
        t1.minutes=sc.nextInt();
        System.out.println("enter the hours ");
        t2.hours=sc.nextInt();
        System.out.println("enter the minutes ");
        t2.minutes=sc.nextInt();
        Time total = new Time(0, 0);
        total=total.Addtime(t1,t2);
        total.Display();
    }
}


