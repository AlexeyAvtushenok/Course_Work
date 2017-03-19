package lib.util;


import org.junit.Assert;
import org.junit.Test;




public class MathJsTest {

    @Test
    public void quadraticEquationComplex() throws Exception {
    // 4x^2 + 6x + 4 = 0
        double a = 4.0;
        double b = 6.0;
        double c = 4.0;

        double[] expectedAnswer = quadEquation(a, b, c);
        double[] answer =  MathJs.quadraticEquation(a,b,c);

        Assert.assertArrayEquals(expectedAnswer,answer,0.0000001);

    }
    @Test
    public void quadraticEquationSimple() throws Exception {
        // x^2 + 8x + 16 = 0
        double a = 1.0;
        double b = 8.0;
        double c = 16.0;

        double[] expectedAnswer = quadEquation(a, b, c);
        double[] answer =  MathJs.quadraticEquation(a,b,c);

        Assert.assertArrayEquals(expectedAnswer,answer,0.0000001);

    }
    @Test
    public void quadraticEquationTwoAnswers() throws Exception {
        // 2x^2 + 2x - 5 = 0
        double a = 2.0;
        double b = 2.0;
        double c = -5.0;

        double[] expectedAnswer = quadEquation(a, b, c);
        double[] answer =  MathJs.quadraticEquation(a,b,c);

        Assert.assertArrayEquals(expectedAnswer,answer,0.0000001);

    }

    @Test
    public void factorial() throws Exception{
        Assert.assertEquals(factorial(5),MathJs.factorial(5),0.001);
    }

    @Test
    public void factorialNegative() throws Exception{
        Assert.assertEquals(-1,MathJs.factorial(-100),0.001);
    }



    private double factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }


    private double[] quadEquation(double a,double b, double c){
        double answer[] = null;
        double d = b*b - 4 * a * c;
        if(d < 0) {
            answer = new double[4];
            answer[0] = - b / ( 2 * a );
            answer[1] =  Math.sqrt( -d ) / ( 2 * a );
            answer[2] = - b / ( 2 * a);
            answer[3] = -Math.sqrt( -d ) / ( 2 * a );
            return answer;
        }
        if(d == 0) {
            answer = new double[1];
            answer[0] =  -b / ( 2 * a );
            return answer;
        }
        if(d > 0){
            answer = new double[2];
            answer[0] = -b / ( 2 * a ) - Math.sqrt( d ) / ( 2 * a );
            answer[1] = -b / ( 2 * a ) + Math.sqrt( d ) / ( 2 * a );
            return answer;
        }
        return  answer;
    }


}