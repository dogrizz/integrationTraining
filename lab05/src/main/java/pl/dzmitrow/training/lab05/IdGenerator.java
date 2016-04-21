package pl.dzmitrow.training.lab05;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {

    AtomicLong counter = new AtomicLong();

    public long getNext(){
        return counter.incrementAndGet();
    }

}
