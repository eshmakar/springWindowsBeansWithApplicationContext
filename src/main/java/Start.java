import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        House house = context.getBean("houseBean", House.class);
        house.buildWall();
        house.view();
        System.out.printf("Кол-во этажей: %d\n", house.getHeight());

        MainWindow window = context.getBean("mainWindowBean", MainWindow.class);
        window.show();

        context.close();
    }
}