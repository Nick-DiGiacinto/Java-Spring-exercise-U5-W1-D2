package nickdg;

import nickdg.entities.Menù;
import nickdg.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D2 {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D2.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D2.class);


        System.out.println(ctx.getBean(Menù.class));

		Pizza p = ctx.getBean(Pizza.class);
		p.setMaxi(true);
		System.out.println(p);
	}

}
