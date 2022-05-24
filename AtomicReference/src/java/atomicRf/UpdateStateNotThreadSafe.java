package java.atomicRf;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {AtomicReference}
 * @Date: {2022/05/13 && 2:24 PM}
 */
public class UpdateStateNotThreadSafe {
    private volatile State state = new State();

    public void update(){
        state = state.update();
    }

    public State getState(){
        return state;
    }
}
