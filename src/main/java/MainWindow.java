import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//это Singleton
public class MainWindow implements InitializingBean, DisposableBean {


    private MainWindow() {} //приватный конструктор, чтобы другие классы не смогли создать объект этого класса

    public void destroy() throws Exception { //это метод интерфейса DisposableBean
       closeConnection();
    }

    public void afterPropertiesSet() throws Exception { //это метод интерфейса InitializingBean
        openConnection();
    }

    private static class MainWindowHolder { //приватный вложенный класс, который создает объект класса Singleton
        static MainWindow instance = new MainWindow();
    }

    public static MainWindow getInstance() { //можно будет вызвать объект этого класса через getInstance
        return MainWindowHolder.instance;
    }

    public void show() {
        System.out.println("Show main window");
    }

    public void openConnection(){
        System.out.println("Main window open connection");
    }

    public void closeConnection(){
        System.out.println("Main window close connection");
    }
}