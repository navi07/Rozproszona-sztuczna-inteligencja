package MyException;

public class ExceptionSample {

    public void doSomething() throws MyException {
        System.out.println("Notification of exception MyException !");
        throw new MyException();
    }
}
