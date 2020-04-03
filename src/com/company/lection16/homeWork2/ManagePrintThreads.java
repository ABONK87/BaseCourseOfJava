package com.company.lection16.homeWork2;

import java.util.ArrayList;
import java.util.List;

public class ManagePrintThreads {
    private List<String> nameOfThreads = new ArrayList<>();
    private List<String> tmpNameOfThreads = new ArrayList<>();
    private List<Threads> threads = new ArrayList<>();

    public List<Threads> createThreads(int countOfThreads) {
        for (int i = 1; i <= countOfThreads; i++) {
            String name = "Thread ";
            threads.add(new Threads (name + i, this));
        }
        return threads;
    }

    public void addThread(List<Threads> threads) {
        for(Threads t: threads) {
            nameOfThreads.add(t.getName());
            tmpNameOfThreads.add((t.getName()));
        }
    }

    public void startThreads (List<Threads> threads) {
        for (Threads t: threads) {
            t.start();
        }
    }

    public void printNameOfThread (Threads thread) {
        synchronized (this) {
            int count = nameOfThreads.size();
            if (count > 0) {
                if (thread.getName().equals(nameOfThreads.get(0))){
                    System.out.println(thread.getName());
                    nameOfThreads.remove(thread.getName());
                    notifyAll();
                    count--;
                }
                else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (count == 0) {
                nameOfThreads.addAll(tmpNameOfThreads);
                notifyAll();
            }
        }
    }

    public void PrintList() {
        System.out.println((long) nameOfThreads.size());
        System.out.println((long) tmpNameOfThreads.size());
    }

    public List<Threads> getThreads() {
        return threads;
    }

    public void setThreads(List<Threads> threads) {
        this.threads = threads;
    }
}
