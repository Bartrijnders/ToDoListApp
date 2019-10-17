package Storage.FileStorage;

import ToDoListModel.ToDoList;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TxtFileSaver implements IFileSaveAble {

    @Override
    public void Save(ToDoList toDoList) {
        try{
            String path = "/Users/bartrijnders/Desktop/ToDoListApp/ToDoListApplication/src/Storage/Files/txtFileStorage.txt";
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(toDoList);
            objectOutputStream.close();
            fileOutputStream.close();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
