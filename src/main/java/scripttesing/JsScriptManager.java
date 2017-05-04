package scripttesing;



import javax.script.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsScriptManager extends ScriptManager {

    public JsScriptManager() {
        super(new ScriptEngineManager().getEngineByName("javascript"));
    }

    @Override
    public Script downloadScript(String path) {
        Script script = new Script();
        FileReader reader = null;
        try {
           reader = new FileReader(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        script.setReader(reader);
        script.setPath(path);

        return script;
    }

    @Override
    public Object executeScript(Script script) throws ScriptTestException {
        Object result = null;
        try {
            result = getEngine().eval(script.getReader());
            Invocable invocable = (Invocable) getEngine();
            result =  invocable.invokeFunction(script.getFunctionName());
        } catch (javax.script.ScriptException | NoSuchMethodException e) {
            throw new ScriptTestException(e);
        }
        return result;
    }

    @Override
    public Object executeScript(Script script, String... args) throws ScriptTestException {
        Object result = null;
        try {
            getEngine().eval(script.getReader());
            Invocable invocable = (Invocable) getEngine();
            result = invocable.invokeFunction(script.getFunctionName(), args);
        } catch (javax.script.ScriptException | NoSuchMethodException e) {
            throw new ScriptTestException(e);
        }
        return result;
    }


    public Object executeScript(Script script, Bindings binding, String... args) throws ScriptTestException {
        Object result = null;
        try {

            getEngine().eval(script.getReader());
            getEngine().setBindings(binding, ScriptContext.GLOBAL_SCOPE);
            Invocable invocable = (Invocable) getEngine();
            result =  invocable.invokeFunction(script.getFunctionName(),  args);
        } catch (javax.script.ScriptException | NoSuchMethodException e) {
            throw new ScriptTestException(e);
        }
        return result;
    }


    public Object executeScript(Script script, Bindings binding) throws ScriptTestException {
        Object result = null;
        try {
            getEngine().eval(script.getReader());
            getEngine().setBindings(binding, ScriptContext.GLOBAL_SCOPE);
            Invocable invocable = (Invocable) getEngine();
            result =  invocable.invokeFunction(script.getFunctionName());
        } catch (javax.script.ScriptException | NoSuchMethodException e) {
            throw new ScriptTestException(e);
        }
        return result;
    }
}
