package Classes;

import Enumerations.PriorityLevel;

public class Priority implements Detail {

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
        return "Priority: " + priorityLevel;
    }
}
