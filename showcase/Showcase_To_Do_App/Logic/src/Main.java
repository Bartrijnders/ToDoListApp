import Classes.App;
import Classes.PriorityAdder;
import Classes.Task;
import Classes.ToDoList;
import Enumerations.PriorityLevel;

public class Main {




        public static void main(String[] args) {

            Task task1 = new Task("proef", false);
            Task task2 = new Task("proef", false);
            Task task3 = new Task("proef", false);

            App app = new App();
            ToDoList tdlist = new ToDoList();
            tdlist.getTasks().add(task1);
            PriorityAdder priorityAdder = new PriorityAdder();
            priorityAdder.addPriorityTo(task1, PriorityLevel.HIGH);
            task1.toString();
        }


}
