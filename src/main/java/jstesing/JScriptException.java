package jstesing;


public class JScriptException extends Exception {
    private static final long serialVersionUID = 1L;

    public JScriptException(){
        super();
    }

    public JScriptException(String message){
        super(message);
    }

    public JScriptException(Exception e){
        super(e);
    }

    public JScriptException(String message, Exception e){
        super(message, e);
    }

}
