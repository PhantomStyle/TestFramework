package phantomstyle.framework.messengeres;

public class ConsoleMessenger implements Messenger {
    public void showMessage(String message) {
        System.out.println(message);
    }
}
