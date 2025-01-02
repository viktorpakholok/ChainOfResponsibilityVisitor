package ua.edu.ucu.apps.task2;

public interface Visitor<T> {
    void visit(Task<T> task);
    void visit(Signature<T> signature);
    void visit(Group<T> group);
}
