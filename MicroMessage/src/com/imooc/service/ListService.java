package com.imooc.service;

import java.sql.SQLException;
import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

/*
 * �б���ص�ҵ����
 */
public class ListService {

	public ListService() {}
		// TODO Auto-generated constructor stub
		public List<Message> queryMessageList(String command,String description) throws SQLException {
			MessageDao messageDao=new MessageDao();
			return messageDao.queryMessageList(command,description);
		}
	

}