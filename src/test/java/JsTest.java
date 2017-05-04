import org.junit.Assume;
import scripttesing.*;
import org.junit.Assert;
import org.junit.Test;

import javax.script.Bindings;
import javax.script.SimpleBindings;

public class JsTest {

    @Test
    public void FactTest() throws Exception{
        ScriptManager scriptManager = new JsScriptManager();
        Script script = scriptManager.downloadScript("src/main/resources/factorial.js");
        script.setFunctionName("fact");

        double factResult = (double) scriptManager.executeScript(script, "5");
        Assert.assertEquals(120, factResult, 0.01);

    }
    @Test
    public void QuadrEqTest() throws Exception{
        ScriptManager scriptManager = new JsScriptManager();
        Script script = scriptManager.downloadScript("src/main/resources/qadratic_equation.js");
        script.setFunctionName("square_equation");

        Bindings bindings = new SimpleBindings();
        bindings.put("a1",4);
        bindings.put("b1",4);
        bindings.put("c1",4);


        double[] expected = {-0.5, 0.866, -0.5,-0.866};
        double[] squareResult = (double[]) ((JsScriptManager)scriptManager).executeScript(script, bindings);

        Assert.assertArrayEquals(expected,squareResult,0.001);

    }
}
