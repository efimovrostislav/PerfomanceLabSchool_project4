public class Main {

    public static void main(String[] args) {
        System.out.println(Integral(0,1, x -> 10));
    }
    public static double Integral(double a, double b, Function function){
        double area = 0;
        double cut = 0.001;
        for (int i = 0; i < (b-a)/cut; i++){
            area += cut * function.func(a + i * cut);
        }
        return  area;
    }
}

interface Function{
    double func(double x);
}