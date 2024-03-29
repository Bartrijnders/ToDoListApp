package ItemDetails;

public class Priority implements IDetailAble {
    private PriorityLevel priorityLevel;

    public Priority(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return String.format("Priority: %s", priorityLevel);
    }
}
