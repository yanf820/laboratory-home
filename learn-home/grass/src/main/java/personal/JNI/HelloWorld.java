package personal.JNI;

/**
 * Created by yf on 2016/10/24.
 */
public class HelloWorld {

    static {
        System.out.println("Hello");
    }

    public native void displayHello();

    public static void main(String[] args) {
        new HelloWorld().displayHello();
    }
}
