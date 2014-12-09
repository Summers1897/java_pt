package com.k.thread.javaThreadStu.chapter13;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {  
  
    private EventStorage storage;  
    public Consumer(EventStorage storage){  
        this.storage = storage;  
    }  
    @Override  
    public void run() {  
        for(int i=0;i<100;i++){  
            storage.get();  
        }  
    }  
}  