package java.atomicRf;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {AtomicReference}
 * @Date: {2022/05/13 && 2:13 PM}
 */
public class State {
    //
    private final Thread thread;
    private final boolean accessedByMultipleThreads;

    public State(Thread thread, boolean accessedByMultipleThreads) {
        super();
        this.thread = thread;
        this.accessedByMultipleThreads = accessedByMultipleThreads;
    }

    public State() {
        super();
        this.thread = null;
        this.accessedByMultipleThreads = false;
    }

    public State update(){
        if (accessedByMultipleThreads){
            return this;
        }
        if (thread==null){
            return new State(Thread.currentThread(), accessedByMultipleThreads);
        }
        if (thread !=Thread.currentThread()){
            return new State(null, true);
        }
        return this;
    }
    public boolean isAccessedByMultipleThreads(){
        return accessedByMultipleThreads;
    }
}
