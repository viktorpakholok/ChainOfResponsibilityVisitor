package ua.edu.ucu.apps.task2;

public class StampingAPI<T> implements Visitor<T> {
    private String groupUuid;

    public StampingAPI(String newGroupUuid) {
        groupUuid = newGroupUuid;
    }

    @Override
    public void visit(Task<T> task) {
        task.setHeader("groupUuid", groupUuid);
    }

    @Override
    public void visit(Signature<T> task) {
        task.setHeader("groupUuid", groupUuid);
    }

    @Override
    public void visit(Group<T> group) {
        group.setHeader("groupUuid", groupUuid);
        for (Task<T> task : group.getTasks()) {
            task.accept(this);
        }
    }
    
}
