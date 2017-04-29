function square_equation() {
    var a = a1;
    var b = b1;
    var c = c1;

    var DoubleArray = Java.type("double[]");

    var d = b * b - 4 * a * c;
    if ( d < 0 ) {

        var answer = new DoubleArray(4);
        answer[0] = - b / ( 2 * a );
        answer[1] =  Math.sqrt( -d ) / ( 2 * a );
        answer[2] = - b / ( 2 * a);
        answer[3] = -Math.sqrt( -d ) / ( 2 * a );
        return answer;

    } else {
        if ( d == 0 ) {
            var answer = new DoubleArray(1);
            answer[0] =  -b / ( 2 * a );
            return answer;

        } else {

            var answer = new DoubleArray(2);
            answer[0] = -b / ( 2 * a ) - Math.sqrt( d ) / ( 2 * a );
            answer[1] = -b / ( 2 * a ) + Math.sqrt( d ) / ( 2 * a );
            return answer;
        }
    }

};

