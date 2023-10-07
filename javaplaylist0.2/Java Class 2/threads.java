//Java Threads->Threads allows a program to operate more efficiently by doing multiple things at the same time.
//Threads can be used to perform complicated tasks in the background without interrupting the main program.


public class threads {
    public static void main(String[] args) {
    Main thread = new Main();
    thread .start ();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}

