package Classes;

import Enumerations.PriorityLevel;

public interface IPriorityAdder {

    void addPriorityTo(Task task, PriorityLevel priorityLevel);
}
