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
 
2. simple 依赖检查
Spring bean的配置文件使用“simple”依赖检查模式。
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
在“type”属性(基本类型或集合类型)，如尚未设置，UnsatisfiedDependencyException将抛出。
org.springframework.beans.factory.UnsatisfiedDependencyException: 
Error creating bean with name 'CustomerBean' 
defined in class path resource [config/Spring-Customer.xml]: 
Unsatisfied dependency expressed through bean property 'type': 
Set this property value or disable dependency checking for this bean.


3. objects 依赖检查

Spring bean配置文件的 “objects”依赖检查模式。
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
在'person'属性(对象类型)，尚未设置，一个UnsatisfiedDependencyException将抛出。

 
org.springframework.beans.factory.UnsatisfiedDependencyException: 
Error creating bean with name 'CustomerBean' 
defined in class path resource [config/Spring-Customer.xml]: 
Unsatisfied dependency expressed through bean property 'person': 
Set this property value or disable dependency checking for this bean.


4. all 依赖检查

Spring bean配置文件的“all”依赖检查模式。
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
对“simple”和“objects”模式的组合，如果有的话类型(原型，集合和对象)的任何属性都没有设置，一个UnsatisfiedDependencyException将被抛出。



全局默认的依赖检查
明确定义的依赖检查模式，每个Bean配置繁琐且容易出错，可以在<beans>根元素设置一个默认的依赖性检查属性强制<beans>根元素内声明的整个bean类适用此规则。然而，这根默认模式将通过一个bean自己指定的模式下可覆盖。
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
在这个配置文件中声明所有的Bean类默都是“all”依赖检查模式。 */