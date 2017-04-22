
import org.junit.Test;


import javax.script.*;
import java.io.File;
import java.io.FileReader;

public class PasswordConfirmTest {

    @Test
    public void passwordTest() throws Exception{
        ScriptEngine engine  = new ScriptEngineManager().getEngineByName("javascript");
        FileReader reader = new FileReader(new File("src/main/resources/PasswordConfirm.js"));



        engine.eval(reader);

        Invocable invocable = (Invocable) engine;
        invocable.invokeFunction("Validate");
        reader.close();
    }

}
