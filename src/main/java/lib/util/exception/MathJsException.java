package lib.util.exception;


public class MathJsException extends Exception {

    private static final long serialVersionUID = 1L;

    public MathJsException(){
        super();
    }

    public MathJsException(String message){
        super(message);
    }

    public MathJsException(Exception e){
        super(e);
    }

    public MathJsException(String message, Exception e){
        super(message, e);
    }

}

