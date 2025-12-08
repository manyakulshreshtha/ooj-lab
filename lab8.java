class bmsce extends Thread{
    public void run(){
        while ((true)) {
            System.out.println("BMS College of Engineering");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class CseThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("CSE");
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class lab8 {
     public static void main(String[] args) {
        bmsce t1 = new bmsce();
        CseThread t2 = new CseThread();

        t1.start();
        t2.start();
}}
