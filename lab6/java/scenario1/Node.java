package java.scenario1;

import java.util.concurrent.BlockingQueue;

public class Node implements Runnable{
    
    private final BlockingQueue<Task> taskQueue;
    private final int nodeId;

    public Node(BlockingQueue<Task> taskQueue, int nodeId){
        this.taskQueue = taskQueue;
        this.nodeId = nodeId;
    }

    @Override
    public void run(){
        try{
            while (true) {
                Task task = taskQueue.take();
                long waitingTime = System.currentTimeMillis() - task.getCreationTime();
                System.out.println("Node " + nodeId + "Processando tarefa " + task.getTaskId() + "do produtor" + task.getProducerId() + ". Tempo em fila: " + waitingTime + "ms.");
                task.execute();
            }
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

}
