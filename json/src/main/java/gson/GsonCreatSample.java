package gson;

import java.lang.reflect.Field;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import bean.Diaosi;

public class GsonCreatSample {

	public static void main(String[] args) {
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
		wangxiaoer.setComment("����һ��ע��");
		wangxiaoer.setIgnore("��Ҫ������");
		GsonBuilder gsonBuilder=new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {//�ص�����
			public String translateName(Field f)
			{
				if(f.getName().equals("name")) {
					return "NAME";
				}
				return f.getName();
			}
		});
		Gson gson=gsonBuilder.create();
		System.out.println(gson.toJson(wangxiaoer));
	}

}
