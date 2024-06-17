package MyException;

public class EmptyValuesException extends Exception{
    public EmptyValuesException(){
        super("The enter values is empty");
    }
}
