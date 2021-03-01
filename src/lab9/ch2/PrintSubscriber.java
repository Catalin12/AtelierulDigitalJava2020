package lab9.ch2;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.concurrent.Flow;

public class PrintSubscriber<String> implements Subscriber<String> {
    public void onSubscriber(Flow.Subscription subscription) {
        subscription.request(1);
    }

    @Override
    public void onSubscribe(Subscription subscription) {

    }

    public void onNext(String item) {
        System.out.println(item);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }

    public void OnCompleted() {
        System.out.println("Completed!");
    }
    public void emptyMono() {

    }
}
