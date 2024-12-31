package ua.edu.ucu.apps.task2;

import java.util.function.Consumer;

import lombok.Getter;

public class Signature<T> extends Task<T> {
    @Getter
    private Consumer<T> consumer;

    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
    }
}
