class GradeCalculator{
     void calculateGrade(int marks) {
        System.out.println("Single Subject Marks: " + marks);
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else if (marks >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
        System.out.println();
    }
    void calculateGrade(int marks1, int marks2, int marks3) {
        double average = (marks1 + marks2 + marks3) / 3.0;
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Average: " + average);
        calculateGrade(average); 
    }
    void calculateGrade(double percentage) {
        System.out.println("Overall Percentage: " + percentage);
        if (percentage >= 90)
            System.out.println("Grade: A");
        else if (percentage >= 75)
            System.out.println("Grade: B");
        else if (percentage >= 60)
            System.out.println("Grade: C");
        else if (percentage >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
        System.out.println();
    }
}
class grade {
 public static void main(String[] args) {
        GradeCalculator gc = new GradeCalculator();
        gc.calculateGrade(88);
        gc.calculateGrade(80, 70, 90);
        gc.calculateGrade(76.5);
    }
}
    

 
