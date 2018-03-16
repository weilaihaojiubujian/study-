package Spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
			new ClassPathXmlApplicationContext("Spring8.xml");

    	Customer cust = (Customer)context.getBean("CustomerBean");
    	Person c=(Person)context.getBean("PersonBean");
    	System.out.println(cust);
    	System.out.println(cust.getAction());
    	
    	System.out.println(c);
    	System.out.println(c.getAddress());
    	System.out.println(c.getAge());
    	System.out.println(c.getName());
    }
}
/*
 * 
 
2. simple �������
Spring bean�������ļ�ʹ�á�simple���������ģʽ��
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="CustomerBean" class="com.yiibai.common.Customer" 
         dependency-check="simple">

		<property name="person" ref="PersonBean" />
		<property name="action" value="buy" />
	</bean>

	<bean id="PersonBean" class="com.yiibai.common.Person">
		<property name="name" value="yiibai" />
		<property name="address" value="address ABC" />
		<property name="age" value="29" />
	</bean>

</beans>
�ڡ�type������(�������ͻ򼯺�����)������δ���ã�UnsatisfiedDependencyException���׳���
org.springframework.beans.factory.UnsatisfiedDependencyException: 
Error creating bean with name 'CustomerBean' 
defined in class path resource [config/Spring-Customer.xml]: 
Unsatisfied dependency expressed through bean property 'type': 
Set this property value or disable dependency checking for this bean.


3. objects �������

Spring bean�����ļ��� ��objects���������ģʽ��
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="CustomerBean" class="com.yiibai.common.Customer" 
         dependency-check="objects">

		<property name="action" value="buy" />
		<property name="type" value="1" />
	</bean>

	<bean id="PersonBean" class="com.yiibai.common.Person">
		<property name="name" value="yiibai" />
		<property name="address" value="address ABC" />
		<property name="age" value="29" />
	</bean>
	
</beans>
��'person'����(��������)����δ���ã�һ��UnsatisfiedDependencyException���׳���

 
org.springframework.beans.factory.UnsatisfiedDependencyException: 
Error creating bean with name 'CustomerBean' 
defined in class path resource [config/Spring-Customer.xml]: 
Unsatisfied dependency expressed through bean property 'person': 
Set this property value or disable dependency checking for this bean.


4. all �������

Spring bean�����ļ��ġ�all���������ģʽ��
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="CustomerBean" class="com.yiibai.common.Customer" 
         dependency-check="all">

		<property name="action" value="buy" />
	</bean>

	<bean id="PersonBean" class="com.yiibai.common.Person">
		<property name="name" value="yiibai" />
		<property name="address" value="address ABC" />
		<property name="age" value="29" />
	</bean>

</beans>
�ԡ�simple���͡�objects��ģʽ����ϣ�����еĻ�����(ԭ�ͣ����ϺͶ���)���κ����Զ�û�����ã�һ��UnsatisfiedDependencyException�����׳���



ȫ��Ĭ�ϵ��������
��ȷ������������ģʽ��ÿ��Bean���÷��������׳���������<beans>��Ԫ������һ��Ĭ�ϵ������Լ������ǿ��<beans>��Ԫ��������������bean�����ô˹���Ȼ�������Ĭ��ģʽ��ͨ��һ��bean�Լ�ָ����ģʽ�¿ɸ��ǡ�
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
	http://www.springframework.org/schema/beans/spring-beans-2.5.xsd" 
	default-dependency-check="all">

	<bean id="CustomerBean" class="com.yiibai.common.Customer">
		<property name="action" value="buy" />
		<property name="type" value="1" />
	</bean>

	<bean id="PersonBean" class="com.yiibai.common.Person">
		<property name="name" value="yiibai" />
		<property name="address" value="address ABC" />
		<property name="age" value="29" />
	</bean>
	
</beans>
����������ļ����������е�Bean��Ĭ���ǡ�all���������ģʽ�� */