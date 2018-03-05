package json;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReadJSONSample {

	public static void main(String[] args) throws IOException, JSONException {
		// TODO Auto-generated method stub
     File file=new File(ReadJSONSample.class.getResource("/wangxiaoer.json").getFile());
     String content=FileUtils.readFileToString(file);
     JSONObject jsonObject=new JSONObject(content);
     if(!jsonObject.isNull("name"))//�������������Ƿ����
     {
    	   System.out.println("������:"+jsonObject.getString("name"));
     }
   
     System.out.println("������:"+jsonObject.getDouble("age"));
     System.out.println("��û��Ů����:"+jsonObject.getBoolean("has_girlfriend"));
     JSONArray majorArray=jsonObject.getJSONArray("major");//JSONArray������������
     for(int i=0;i<majorArray.length();i++) {
    	 String m=majorArray.getString(i);
    	 System.out.println("רҵ:"+(i+1)+m);
     }
	}

}
