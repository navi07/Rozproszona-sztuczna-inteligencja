package ReadWrite;


import Model.Student;

import java.io.*;


public class Read implements Serializable {

    public void read(String where)  throws IOException {
        try{
        FileReader fileReader = new FileReader(where);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String textLine = bufferedReader.readLine();
        do {
            System.out.println(textLine);

            textLine = bufferedReader.readLine();
        } while(textLine != null);

        bufferedReader.close();
        }
    catch(IOException e){
            e.printStackTrace();
            System.out.println("Error while reading from file !");

        }
    }

    public void serializeRead(String where) {
        try {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream(where));
            Student newStudent = (Student) objectInputStream.readObject();

            objectInputStream.close();
            System.out.println("\nDeserialization : " + "Student : " + "\nID : " + newStudent.getId() +
                    "\n Name : " + newStudent.getName() + "\n Surname : "
                    + newStudent.getSurname() + "\n Email : " + newStudent.getEmail()
                    + "\n Address : " + newStudent.getAddress() + "\n Phone number : " + newStudent.getPhoneNumber()
                    + "\n PESEL : " + newStudent.getPesel()
                    + "\n Group : " + newStudent.getGroupNumber() + "\n Final grade : " + newStudent.getFinalGrade()
                    + "\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
