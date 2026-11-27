public class Calculator {

    public Calculator() {}

    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int k, int x, int b){
        return add(times(k, x), b);
    }
}
