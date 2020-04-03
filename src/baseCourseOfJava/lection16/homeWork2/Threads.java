package baseCourseOfJava.lection16.homeWork2;

public class Threads extends Thread {
    private ManagePrintThreads managePrintThreads;

    public void run () {
        while (true){
            managePrintThreads.printNameOfThread(this);
        }
    }

    public Threads(String name, ManagePrintThreads managePrintThreads) {
        super(name);
        this.managePrintThreads = managePrintThreads;
    }


}
