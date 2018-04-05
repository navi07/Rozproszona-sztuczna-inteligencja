package ReadWrite;

import Model.Student;
import java.io.*;


public class Write implements Serializable {


    public void write(String name, String where) throws FileNotFoundException {
        try{
            PrintWriter writer = new PrintWriter(where);
            writer.println(name);
            writer.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("Write error !");
        }
    }

    public void serializeWrite(Student student, String where) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(where));
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            System.out.printf("Serialized data is saved in "+ where + "\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
