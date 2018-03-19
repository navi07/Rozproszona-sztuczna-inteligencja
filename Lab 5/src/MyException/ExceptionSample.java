package MyException;

import java.io.Serializable;

public class ExceptionSample implements Serializable {

    public void doSomething() throws MyException {
        System.out.println("Notification of exception MyException !");
        throw new MyException();
    }
}
