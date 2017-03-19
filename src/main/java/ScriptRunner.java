import lib.util.MathJs;
import lib.util.exception.MathJsException;


public class ScriptRunner {
    public static void main(String[] args) {

        try {
            MathJs.quadraticEquation(1,8,5);
            MathJs.factorial(5);
        } catch (MathJsException e) {
            System.err.print(e);
        }


    }
}
