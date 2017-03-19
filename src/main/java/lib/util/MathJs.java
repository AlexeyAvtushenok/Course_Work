package lib.util;

import javax.script.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import lib.util.exception.*;

public class MathJs {


    private MathJs(){}

    private static final String Q_EQUEATION_JS_PATH = "src/main/resources/qadratic_equation.js";
    private static final String FACTORIAL_JS_PATH = "src/main/resources/factorial.js";

    public static double[] quadraticEquation(double a, double b, double c) throws MathJsException {
        String aParameter = "a1";
        String bParameter = "b1";
        String cParameter = "c1";

        File file = new File(Q_EQUEATION_JS_PATH);

        Bindings bindings = new SimpleBindings();
        bindings.put(aParameter, a);
        bindings.put(bParameter, b);
        bindings.put(cParameter, c);

        double[] answer;

        try (FileReader reader = new FileReader(file)) {

            ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
            answer = (double[]) engine.eval(reader, bindings);

        } catch (IOException | ScriptException e) {
            throw new MathJsException(e);
        }

        return answer;

    }

    public static double factorial(int n) throws MathJsException {

        File file = new File(FACTORIAL_JS_PATH);
        double result;

        try (FileReader reader = new FileReader(file)) {

            ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
            engine.eval(reader);
            Invocable invocable = (Invocable) engine;
            result = (double) invocable.invokeFunction("fact", n);

        } catch (IOException | ScriptException |NoSuchMethodException e) {
            throw new MathJsException(e);
        }
        return result;
    }
}
