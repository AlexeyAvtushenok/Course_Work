package jstesing;


import javax.script.ScriptEngine;

public abstract class ScriptManager {

    private ScriptEngine engine;

    ScriptManager(ScriptEngine engine){
        this.engine = engine;
    }

    ScriptEngine getEngine() {
        return engine;
    }

    public abstract Script downloadScript(String path);
    public abstract Object executeScript(Script script) throws JScriptException;
    public abstract Object executeScript(Script script, String ... args) throws JScriptException;


}
