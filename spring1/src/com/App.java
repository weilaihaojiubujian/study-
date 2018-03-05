package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    	   new ClassPathXmlApplicationContext(new String[] {"Spring.xml"});

    	OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();
    	  
    }
}
//spring�����ʵ��
//���ڣ�ֻ��Ҫ�ı� Spring XML �ļ�ʹ�ò�ͬ�������������
//ֻ�޸� Spring XML �ļ�������Ҫ�����޸ģ�����ζ�Ÿ��ٵĴ���