package Classes;

import Enumerations.PriorityLevel;

public class PriorityAdder implements IPriorityAdder{

    public void addPriorityTo(Task task, PriorityLevel priorityLevel) {
        for (Detail d: task.getDetails()) {
            if(d instanceof Priority){
                task.getDetails().remove(d);
            }
        }
        task.getDetails().add(new Priority(priorityLevel));
    }
}
