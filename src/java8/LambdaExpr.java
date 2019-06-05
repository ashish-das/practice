package java8;

public class LambdaExpr {

    //parameter -> expression body
    static MathOperation add = (int a,int b) -> a + b;

    static MathOperation sub = (a,b) -> a-b;

    static MathOperation mul = (a,b) -> { return a*b;};

    static MathOperation div = (int a, int b) -> a/b;

    public static void main(String[] args) {

        LambdaExpr lambdaExpr = new LambdaExpr();

        System.out.println("10 + 5 = " + lambdaExpr.operate(10, 5, add));
        System.out.println("10 - 5 = " + lambdaExpr.operate(10, 5, sub));
        System.out.println("10 x 5 = " + lambdaExpr.operate(10, 5, mul));
        System.out.println("10 / 5 = " + lambdaExpr.operate(10, 5, div));

        /* Default Method Calling */
        DefaultMethod defaultMethod = new DefaultMethodImpl();
        defaultMethod.print();
        DefaultMethod.blowHorn();

        /* stream API*/

        StreamsClass streamsClass = new StreamsClass();
        streamsClass.forEach();
        streamsClass.map();
        streamsClass.filter();
        streamsClass.sort();


    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}

interface MathOperation{
    /* Functiona; interface are the interface with only one abstract
    * method  */
    int operation(int a,int b);
}