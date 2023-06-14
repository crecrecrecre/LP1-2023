package Exception;

public class ComercializarException extends Exception {

    public ComercializarException(String message) {
        super(message);
    }

    public ComercializarException() {
        System.out.println("erro tarr?");
    }
}
