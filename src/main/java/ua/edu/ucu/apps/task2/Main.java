package ua.edu.ucu.apps.task2;

public class Main {

    private static final int NUMBER_ONE = 10;

    public static void main(String[] args) {
        
        Group<Integer> nestedGroup = new Group<>();

        nestedGroup.addTask(new Signature<>(System.out::println))
        .addTask(new Signature<>(x -> System.out.println(x * x)));

        Group<Integer> group = new Group<>();

        group.addTask(nestedGroup)
        .addTask(new Signature<>(x -> System.out.println(x * x * x)));

        group.apply(NUMBER_ONE);
    }
}
