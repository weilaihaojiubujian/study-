package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
			new ClassPathXmlApplicationContext("Spring7.xml");

    	Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust);
    	System.out.println(cust.getAction());
    	System.out.println(cust.getCountry());
    	System.out.println(cust.getType());
    }
}
/*在 Spring，继承是用为支持bean设置一个 bean 来分享共同的值，属性或配置。
一个子 bean 或继承的bean可以继承其父 bean 的配置，属性和一些属性。另外，子 Bean 允许覆盖继承的值。*/