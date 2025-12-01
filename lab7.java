class WrongAgeException extends Exception{
    public WrongAgeException(String message){
        super(message);
    }
}
class InvalidSonAgeException extends Exception{
      public InvalidSonAgeException(String message) {
        super(message);
    }
}
class Father{
    int fatherAge;

    Father(int age)throws WrongAgeException {
        if(age<0){
            throw new WrongAgeException("Father's age cant be negative");
        }
        this.fatherAge=age;
        System.out.println("Father age accepted: "+fatherAge);
    }
}
class Son extends Father{
    int sonAge;

     Son(int fatherAge,int sonAge) throws WrongAgeException,InvalidSonAgeException{
        super(fatherAge);
        if(sonAge>=fatherAge){
            throw new InvalidSonAgeException("Son's age must be lesser than Father's");
        }
        if(sonAge<0){
            throw new InvalidSonAgeException("Son's age cant be negative");
        }
        this.sonAge=sonAge;
        System.out.println("Son age accepted: "+sonAge);
     }
}
public class lab7 {
    public static void main(String[] args) {
        try {
            Son s1 = new Son(45,17);
        } catch (WrongAgeException|InvalidSonAgeException e) {
              System.out.println("Exception: " + e.getMessage());
        }
        try {
            Father f1 = new Father(37);
        } catch (WrongAgeException e) {
              System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("INVALID CASES");
        try {
            Son s2 = new Son(36,54);
        } catch (WrongAgeException|InvalidSonAgeException e) {
              System.out.println("Exception: " + e.getMessage());
        }
        try {
            Son s3 = new Son(-45,10);
        } catch (WrongAgeException|InvalidSonAgeException e) {
              System.out.println("Exception: " + e.getMessage());
        }
        try {
            Father f2 = new Father(-37);
        } catch (WrongAgeException e) {
              System.out.println("Exception: " + e.getMessage());
        }
    }
    
    
}
