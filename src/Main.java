import java.awt.*;

public class Main extends Canvas implements Runnable {

    public static final int WIDTH = 450, HEIGHT = 400;

    @Override
    public void run() {

    }

    public synchronized void start() {

    }

    public Main() {
        new Frame(WIDTH, HEIGHT, "Starting with Graphics", this);
    }

    public static void main(String[] args) {
        new Main();
    }


}
