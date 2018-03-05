package wang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    	  new ClassPathXmlApplicationContext(new String[] {"Spring1.xml"});

    	Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust);
    }
}