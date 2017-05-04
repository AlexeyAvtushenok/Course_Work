package scripttesing;


public class ScriptTestException extends Exception {
    private static final long serialVersionUID = 1L;

    public ScriptTestException(){
        super();
    }

    public ScriptTestException(String message){
        super(message);
    }

    public ScriptTestException(Exception e){
        super(e);
    }

    public ScriptTestException(String message, Exception e){
        super(message, e);
    }

}
