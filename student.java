import java.util.Scanner;
class Student {
    String usn;
    String name;
    int credits[];
    int marks[];
    int sub_num;

    void accdetails(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter usn");
        usn=inp.nextLine();
        System.out.println("Enter name");
        name=inp.nextLine();
        System.out.println("Enter number of subjects");
        sub_num=inp.nextInt();
        credits=new int[sub_num];
        marks=new int[sub_num];
        int i;
        for(i=0;i<sub_num;i++){
        System.out.println("Enter subject credits");
        credits[i]=inp.nextInt();  
        System.out.println("Enter subject marks");
        marks[i]=inp.nextInt();  
        }

    }
    void displaydetail(){
        System.out.println("STUDENT DETAILS");
        System.out.println("USN- "+usn);
        System.out.println("NAME- "+name);
        System.out.println("SUBJECTS  "+sub_num);
        int j;
        for(j=0;j<sub_num;j++){
            System.out.println("subject- "+(j+1)+" credits- "+credits[j]+" marks- "+marks[j]);
         }
    }
    int getgradepnt(int marks){
        if(marks>=90){
            return 10;
        }
        else if(marks>=80&&marks<90){
            return 9;
        }
        else if(marks>=70&&marks<80){
            return 8;
        }
        else if(marks>=60&&marks<70){
            return 7;
        }
        else if(marks>=50&&marks<60){
            return 6;
        }
        else if(marks>=40&&marks<50){
            return 5;
        }
        else{
            return 0;
        }
    }
    void calcsgpa(){
        int totalcred=0;
        int sumof=0;
        for(int k=0;k<sub_num;k++){
            totalcred+=credits[k];
            int gradepnt=getgradepnt(marks[k]);
            sumof +=gradepnt*credits[k];
        }
        double sgpa= (double)sumof/totalcred;
        System.out.println("SGPA-"+sgpa);
    }
    public static void main(String[] args) {
        Student s =new Student();
        s.accdetails();
        s.displaydetail();
        s.calcsgpa();
    }
}
