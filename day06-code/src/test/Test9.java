package test;

public class Test9 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前" + number);//100
        change(number);
        System.out.println("调用change方法后" + number);//100
    }

    private static void change(int number) {
        number = 200;
        System.out.println("change方法中" + number);//200
    }
}
