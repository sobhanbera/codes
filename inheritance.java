class Inheri {
    public int a = 1;
    public int b = 1;
    public void method() {
        System.out.println("we are in the method 1");
    }
}

public class inheritance extends Inheri {
    public static void main(String[] args) {
        Inheri v = new Inheri();
        v.method();
    }
}
