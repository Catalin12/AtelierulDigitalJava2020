package lab9.ch1;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Main {
    Flux<String> emptyFlux() {
        return Flux.empty();
    }
    Flux<String> fooBarFromValues() {
        return Flux.just("foo", "baR");
    }
    Flux<String> fooBarFromList() {

        List<String> list = Arrays.asList("foo", "bar");
        return Flux.fromIterable(list);
    }
    Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException());
    }
    Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(1000)).take(10);
    }

    public static void main(String[] args) {
        Main ch1 = new Main();
        ch1.emptyFlux().subscribe(System.out::println);

        ch1.fooBarFromValues().subscribe(System.out::println);

        ch1.errorFlux().subscribe(System.out::println);
    }
}
