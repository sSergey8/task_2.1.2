import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorldOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorldTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catOne = (Cat) applicationContext.getBean("cat");
        Cat catTwo = (Cat) applicationContext.getBean("cat");

        System.out.println(helloWorldOne.getMessage());
        System.out.println(helloWorldTwo.getMessage());

        System.out.println(catOne.getMessage());
        System.out.println(catTwo.getMessage());

        System.out.println("Hello World = " + (helloWorldOne == helloWorldTwo));
        System.out.println("Cat = " + (catOne == catTwo));


    }
}