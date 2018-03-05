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
     if(!jsonObject.isNull("name"))//用来检验数据是否存在
     {
    	   System.out.println("姓名是:"+jsonObject.getString("name"));
     }
   
     System.out.println("年龄是:"+jsonObject.getDouble("age"));
     System.out.println("有没有女朋友:"+jsonObject.getBoolean("has_girlfriend"));
     JSONArray majorArray=jsonObject.getJSONArray("major");//JSONArray用来遍历数组
     for(int i=0;i<majorArray.length();i++) {
    	 String m=majorArray.getString(i);
    	 System.out.println("专业:"+(i+1)+m);
     }
	}

}
