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

        for(int i = 0; i < 3; i++){
            new Thread(new Node(taskQueue, i + 1)).start();
        }

        new Thread(() -> {
            while(true){
                try{
                    Thread.sleep(5000); //5 segundos
                    //logica
                }
                catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}
