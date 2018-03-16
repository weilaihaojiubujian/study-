package com.imooc.dao;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.imooc.bean.Message;
import com.imooc.db.DBAccess;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class MessageDao {

	/*
	 * 和message表相关的数据库操作
	 */
	
	
		// TODO Auto-generated constructor stub
		/*
		 * 根据查询条件查询消息列表
		 */
//		public List<Message> queryMessageList(String command,String description) throws SQLException {
//			List<Message>messageList=new ArrayList<Message>(); 
//			try {
//				Class.forName("com.mysql.jdbc.Driver");
//				Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shopping","root","1004758012");
//				StringBuilder sql=new StringBuilder("select ID,COMMAND,DESCRIPTION,CONTENT from message where 1=1");
//				List<String>paramList=new ArrayList<String>();
//				if(command!=null&&!"".equals(command.trim()))
//				{
//					sql.append("and COMMAND=?");
//					paramList.add(command);
//				}
//				if(description!=null&&!"".equals(description.trim()))
//				{
//					sql.append("and DESCRIPTION'%'?'%'");
//					paramList.add(description);
//				}
//				PreparedStatement statement=(PreparedStatement) conn.prepareStatement(sql.toString());
//				for(int i=0;i<paramList.size();i++) {
//					statement.setString(i+1,paramList.get(i));
//				}
//				ResultSet rs=statement.executeQuery();
//			
//				while(rs.next())
//				{
//					Message message=new Message();
//					messageList.add(message);
//					message.setId(rs.getString("ID"));
//					message.setCommand(rs.getString("COMMAND"));
//					message.setDescription(rs.getString("DESCRIPTION"));
//					message.setContent(rs.getString("CONTENT"));
//				}
//				return messageList;
//			} 
//			
//			catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return messageList;
//		}
	
	public List<Message> queryMessageList(String command,String description) {
		DBAccess dBAccess=new DBAccess();
		List<Message>messageList=new ArrayList<Message>(); 
		SqlSession sqlSession=null;
		try {
			sqlSession=dBAccess.getSqlSession();
			//通过sqlSession执行sql语句
			Message message=new Message();
			message.setCommand(command);
			message.setDescription(description);
			messageList=sqlSession.selectList("Message.queryMessageList",message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(sqlSession!=null) {
				sqlSession.close();
			}
			
		}
		return messageList;
	}
	public static void main(String[]args) {
		MessageDao messageDao=new MessageDao();
		messageDao.queryMessageList("","");
		
	}
}
