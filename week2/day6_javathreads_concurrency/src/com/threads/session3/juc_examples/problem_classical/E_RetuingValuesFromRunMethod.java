package com.threads.session3.juc_examples.problem_classical;
//
//class Cal implements Runnable{
//    int x, y, sum;
//   volatile boolean isDone=false;
//
//    public Cal(int x, int y){
//        this.x = x;
//        this.y=y;
//    }
//
//    public int getSum(){
//        if(!isDone){
//            synchronized (this){
//                try{
//                    wait();
//                }catch (InterruptedException e){}
//            }
//        }
//        return sum;
//    }
//    @Override
//    public void run() {
//        try{
//            Thread.sleep(1000);
//        }catch (Exception e){}
//        sum=x+y;
//        isDone=true;
//        synchronized (this){
//            notify();
//        }
//
//    }
//}

class Cal implements Runnable{
    int x, y, sum;
    public Cal(int x, int y){
        this.x = x;
        this.y=y;
    }

    public int getSum(){
        return sum;
    }
    @Override
    public void run() {
        sum=x+y;
    }
}
public class E_RetuingValuesFromRunMethod {
    public static void main(String[] args)throws Exception {

        Cal cal=new Cal(3,5);
        Thread t=new Thread(cal);
        t.start();

       // t.join();
        System.out.println(cal.getSum());
    }
}
