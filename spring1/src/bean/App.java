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
/*�� Spring���̳�����Ϊ֧��bean����һ�� bean ������ͬ��ֵ�����Ի����á�
һ���� bean ��̳е�bean���Լ̳��丸 bean �����ã����Ժ�һЩ���ԡ����⣬�� Bean �����Ǽ̳е�ֵ��*/