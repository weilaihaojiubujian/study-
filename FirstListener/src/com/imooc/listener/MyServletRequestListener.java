package com.imooc.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {
    public void requestDestoryed(ServletRequestEvent servletrequestevent ) {
    	
    	System.out.println("requestDestoryed");
    }
    public void requestInitialized(ServletRequestEvent servletrequestevent ) {
    	String name=servletrequestevent.getServletRequest().getParameter("name");
    	System.out.println("requestInitialized name:"+name);
    }
}
