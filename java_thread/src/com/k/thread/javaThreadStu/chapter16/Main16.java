package com.k.thread.javaThreadStu.chapter16;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main16 {  
  
    /** 
     * <p> 
     * </p> 
     * @author zhangjunshuai 
     * @date 2014-9-23 下午8:45:31 
     * @param args 
     */  
    public static void main(String[] args) {  
        PrintQueue2 printQueue = new PrintQueue2();  
        Thread thread[] = new Thread[10];  
        for(int i=0;i<10;i++){  
            thread[i] = new Thread(new Job(printQueue),"Thread"+i);  
        }  
  
        for(int i=0;i<10;i++){  
            thread[i].start();  
        }  
    }  
  
}  