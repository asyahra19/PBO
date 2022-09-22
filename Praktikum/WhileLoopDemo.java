import java.util.concurrent.TimeUnit;

public class WhileLoopDemo {
    public static void main(String[] args) {
        //int i = 0;
        int i = 3;
        while (true) {
            System.out.println("Hello ke-" + i);
            i+=3;

            if(i > 300)
            break;

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
}