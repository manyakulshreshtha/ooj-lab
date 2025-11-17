import java.util.Scanner;
 class Account{
    String name;
    String accno;
    String acctype;
    double balance;
    
    Account(String n,String acn,String act,double bal) {
        name=n;
        accno=acn;
        acctype=act;
        balance=bal;
    }

    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited: "+amount);
        System.out.println("Updated balance: "+balance);
    }
    void  displayBalance(){
        System.out.println("Current Balance: "+balance);
    }

    void withdraw(double amount){}
    
 }

 class SavAcc extends  Account{
    double interestRate=5.0;
    SavAcc(String n,String acn,double bal) {
        super(n, acn,"saving", bal);
    }

    void computeinterest(){
        double interest=balance*Math.pow((1+interestRate/100),1)-balance;
        balance+=interest;
        System.out.println("Interest Added: "+interest);
        System.out.println("Updated balance after interest: "+balance);
    }
    @Override
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insuffecient Balance");
        }
        else{
            balance-=amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Updated balance: " + balance);
        }
    }
 }

 class CurAcc extends Account{
    double minbal=500.0;
    double servicechrg=50.0;

    CurAcc(String n,String acn,double bal) {
        super(n, acn, "current", bal);
    }
     void checkBalance() {
        if (balance < minbal) {
            balance -= servicechrg;
            System.out.println("Balance below minimum! Service charge imposed: " + servicechrg);
        }
    }
    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            checkBalance();
            System.out.println("Updated balance: " + balance);
        }
    } 
 }

 public class prog5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavAcc savings = new SavAcc("Alice", "SA101", 1000);
        CurAcc current = new CurAcc("Bob", "CA202", 800);

        System.out.println("\nSavings Account Operations\n");
        savings.deposit(500);
        savings.computeinterest();
        savings.withdraw(200);
        savings.displayBalance();

        System.out.println("\nCurrent Account Operations\n ");
        current.deposit(200);
        current.withdraw(600); 
        current.displayBalance();

        sc.close();
    }
}
