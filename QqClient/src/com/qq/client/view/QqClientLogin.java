package com.qq.client.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
/*
 * qq�ͻ��˵�½����
 */
public class QqClientLogin extends JFrame {

	//���山����Ҫ�����
	JLabel jbll;
	
	//�����в���Ҫ�����
	
	//�����ϲ���Ҫ�����
	JPanel jp1;
	JButton jp1_jb1,jp1_jb2,jp1_jb3;
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqClientLogin qqClientLogin=new QqClientLogin();
	}
     public QqClientLogin() {
		// TODO Auto-generated constructor stub
		//������
		jbll=new JLabel(new ImageIcon("image/7.jpg"));
		
		//�����ϲ�
		jp1=new JPanel();
		jp1_jb1=new JButton(new ImageIcon("image/12.jpg"));
		
		jp1_jb2=new JButton(new ImageIcon("image/13.jpg"));
		
		jp1_jb3=new JButton(new ImageIcon("image/30.jpg"));
		//��������ť�ŵ�jp1
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
