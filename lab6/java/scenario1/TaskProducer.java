import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;


public class TaskProducer implements Runnable{

    private final BlockingQueue<Task> taskQueue;
    private final int productionTime;
    private final AtomicInteger producerId;
    private static AtomicInteger idCounter = new AtomicInteger(0);

    public TaskProducer(BlockingQueue<Task> taskQueue, int productionTime){
        this.taskQueue = taskQueue;
        this.productionTime = productionTime;
        this.producerId = new AtomicInteger(idCounter.incrementAndGet());
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}
