class Thread1 extends Thread{

    int i=1;
    @Override
    public void run(){

        while(i<10){

            System.out.println("Hello Thread 1");

            i++;
        }
    }

 
}
class Thread2 extends Thread{

    int i=1;

    @Override
    public void run(){

        while(i<10){

            System.out.println("Hello Thread 2");

            i++; 
        }
    }


}


public class Threadss {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        t1.start();
        t2.start();
    }
    
}
