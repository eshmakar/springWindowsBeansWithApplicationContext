//это Singleton
public class MainWindow {
    private MainWindow() {} //приватный конструктор, чтобы другие классы не смогли создать объект этого класса

    private static class MainWindowHolder { //приватный вложенный класс, который создает объект класса Singleton
        static MainWindow instance = new MainWindow();
    }

    public static MainWindow getInstance() { //можно будет вызвать объект этого класса через getInstance
        return MainWindowHolder.instance;
    }

    public void show() {
        System.out.println("Show main window");
    }

    public void connection(){
        System.out.println("Main window connection");
    }
}