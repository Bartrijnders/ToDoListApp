package Storage.FileStorage;

import ToDoListModel.ToDoList;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TxtFileLoader implements IFileLoadAble{

    @Override
    public ToDoList Load() {
        try{
            String path = "/Users/bartrijnders/Desktop/ToDoListApp/ToDoListApplication/src/Storage/Files/txtFileStorage.txt";
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ToDoList output = (ToDoList) objectInputStream.readObject();
            return output;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
