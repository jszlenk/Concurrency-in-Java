package ConcurrentCollections.DelayQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedWorker implements Delayed {

    private long duration;
    private String message;

    DelayedWorker(long duration, String message) {
        this.duration = System.currentTimeMillis() + duration;
        this.message = message;
    }

    @Override
    public int compareTo(Delayed otherDelayed) {
        return Long.compare(this.duration, ((DelayedWorker) otherDelayed).getDuration());
    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(duration - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    private long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}