package json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import bean.Diaosi;

public class JsonObjectSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creatJsonByBean();
	}

	private static void JSONObject() {
		// TODO Auto-generated method stub
		JSONObject wangxiaoer=new JSONObject();
		Object nullObj=null;
		try {
			wangxiaoer.put("name", "��С��");
			wangxiaoer.put("age", 25.2);
			wangxiaoer.put("birthday", "1990-01-01");
			wangxiaoer.put("school", "����");
			wangxiaoer.put("major", new String[] {"��","�ھ��"});
			wangxiaoer.put("has_girlfriend", false);
			wangxiaoer.put("car", nullObj);
			wangxiaoer.put("house", nullObj);
			wangxiaoer.put("comment", "����һ��ע��");
			System.out.println(wangxiaoer.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

}
	private static void creatJsonByMap() {
		// TODO Auto-generated method stub
		Map<String,Object> wangxiaoer=new HashMap<String,Object>();
		Object nullObj=null;
		
			wangxiaoer.put("name", "��С��");
			wangxiaoer.put("age", 25.2);
			wangxiaoer.put("birthday", "1990-01-01");
			wangxiaoer.put("school", "����");
			wangxiaoer.put("major", new String[] {"��","�ھ��"});
			wangxiaoer.put("has_girlfriend", false);
			wangxiaoer.put("car", nullObj);
			wangxiaoer.put("house", nullObj);
			wangxiaoer.put("comment", "����һ��ע��");
			System.out.println(new JSONObject(wangxiaoer).toString());
		
}
	private static void creatJsonByBean() {
		// TODO Auto-generated method stub
		Diaosi wangxiaoer=new Diaosi();
		
		
			wangxiaoer.setName(("��С��"));;
			wangxiaoer.setAge(25.2);;
			wangxiaoer.setBirthday("1990-01-01");;
			wangxiaoer.setSchool("����");;
			wangxiaoer.setMajor(new String[] {"��","�ھ��"});;
			wangxiaoer.setHas_girlfriend(false);;
			wangxiaoer.setCar(null);
			wangxiaoer.setHouse(null);;
			wangxiaoer.setComment("����һ��ע��");;
			System.out.println(new JSONObject(wangxiaoer));
		
}
}