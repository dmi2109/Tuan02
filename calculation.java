package Tuan02;

public class calculation {
    private int a;
    private int b;

    public calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public int minus(){
        return a - b;
    }

    public int mul(){
        return a * b;
    }

    public int div(){
        return a / b;
    }

    public static void main(String[] args) {
        calculation cal1 = new calculation(6,2);
        System.out.println(cal1.sum());
        System.out.println(cal1.minus());
        System.out.println(cal1.mul());
        System.out.println(cal1.div());
    }
}
