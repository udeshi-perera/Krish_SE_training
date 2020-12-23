package com.thread;

public class Employee implements Runnable  {

    public void run() {
        for(int i=0;i<50;i++){
            System.out.println("child "+" "+i);
            try{
                Thread.sleep(250);
            }
            catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
        }
    }
}
