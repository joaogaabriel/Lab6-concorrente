package java.scenario1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Scenario1 {
    
    public static void main(String[] args){

        BlockingQueue<Task> taskQueue = new LinkedBlockingQueue<>();

        //criando 5 produtores com intervalo 5000ms
        for(int i = 0; i < 5; ++i){
            new Thread(new TaskProducer(taskQueue, 5000)).start();
        }
    }
}
