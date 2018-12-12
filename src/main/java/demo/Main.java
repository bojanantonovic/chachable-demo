package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class)) {

            final DemoObjectService service = context.getBean(DemoObjectService.class);

            new Random().
                    ints(1, 10).
                    mapToObj(service::getDemoObject).
                    limit(15).
                    forEach(System.out::println);
        }
    }
}
