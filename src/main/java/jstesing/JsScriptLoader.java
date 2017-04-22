package jstesing;


import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsScriptLoader extends ScriptLoader {

    public JsScriptLoader(){
        super(new ScriptEngineManager().getEngineByName("javascript"));
    }


    @Override
    public Script downloadScript(String path) {
        File file = new File(path);
        FileReader reader = null;
        try {
             reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Script script = new ScriptJS();
        script.setFile(file);
        script.setPath(path);
        try {
            //script.setJsText();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
