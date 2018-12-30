package springdatabase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdb.StudentsDao;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		StudentsDao dao = (StudentsDao) context.getBean("studentsDao");
		System.out.println("hello");
		dao.getPoints();
		System.out.println("world");

	}

}
