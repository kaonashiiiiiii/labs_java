public class laba_1_2 {
    //24  4 22 13

    static void Task1 () {
        //4
        double a = 3.56, b = 1.02, c = 3, d = 2.43;

        double y = Math.pow(Math.tan(a),1/c)/(1+Math.sinh(b)/Math.log(d+c));

        System.out.println(y);
    }
    static void Task2 () {
        //22
        double a = 1.23, b = -0.34, c = 0.707, d = 2.312;

        double y = Math.pow(4*Math.sinh(Math.sqrt(Math.abs(a/b)))+3*Math.pow(Math.sin(c),-1),d);

        System.out.println(y);

    }

    static void Task3 () {
        //13
        double a = -2.86, b = 1.62, c = 10.874, d = -2.91;
        double y = Math.log(Math.abs(2*a))/3*Math.tan(b)-Math.sqrt(c/Math.sqrt(Math.abs(d)));
        System.out.println(y);

    }



    public static void main (String[] args) {
        Task1();
        Task2();
        Task3();
    }
}