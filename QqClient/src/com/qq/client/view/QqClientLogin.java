package com.qq.client.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
/*
 * qq客户端登陆界面
 */
public class QqClientLogin extends JFrame {

	//定义北部需要的组件
	JLabel jbll;
	
	//定义中部需要的组件
	
	//定义南部需要的组件
	JPanel jp1;
	JButton jp1_jb1,jp1_jb2,jp1_jb3;
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqClientLogin qqClientLogin=new QqClientLogin();
	}
     public QqClientLogin() {
		// TODO Auto-generated constructor stub
		//处理北部
		jbll=new JLabel(new ImageIcon("image/7.jpg"));
		
		//处理南部
		jp1=new JPanel();
		jp1_jb1=new JButton(new ImageIcon("image/12.jpg"));
		
		jp1_jb2=new JButton(new ImageIcon("image/13.jpg"));
		
		jp1_jb3=new JButton(new ImageIcon("image/30.jpg"));
		//把三个按钮放到jp1
		jp1.add(jp1_jb1);
		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);
		
		this.add(jbll,"North");
		this.add(jp1,"South");
		this.setSize(350,240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
