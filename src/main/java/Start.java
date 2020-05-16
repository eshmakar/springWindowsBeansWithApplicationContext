import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        House house = context.getBean("houseBean", House.class);
        house.view();
        System.out.printf("House height: %d", house.getHeight());
    }
}
