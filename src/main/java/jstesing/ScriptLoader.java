package jstesing;


import javax.script.ScriptEngine;

public abstract class ScriptLoader {

    private Script script;
    private ScriptEngine scriptEngine;

    ScriptLoader(ScriptEngine engine){
        scriptEngine = engine;

    }

    public Script getScript() {
        return script;
    }

    public void setScript(Script script) {
        this.script = script;
    }

    public ScriptEngine getScriptEngine() {
        return scriptEngine;
    }

    public void setScriptEngine(ScriptEngine scriptEngine) {
        this.scriptEngine = scriptEngine;
    }




    public abstract Script downloadScript(String path);

}
