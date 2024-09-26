package java.scenario1;

public class Task {
    private final int producerId;
    private final long taskId;
    private final long creationTime;

    public Task(int producerId){
        this.producerId = producerId;
        this.taskId = System.currentTimeMillis();
        this.creationTime = System.currentTimeMillis();
    }

    public void execute(){
        long executionTime = (long) (Math.random() * (15000 - 1000)) + 1000;
        try {
            Thread.sleep(executionTime);
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    public long getTaskId(){
        return taskId;
    }
    public long getCreationTime(){
        return creationTime;
    }
    public int getProducerId(){
        return producerId;
    }
    
}
