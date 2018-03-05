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
		wangxiaoer.setName(("王小二"));;
		wangxiaoer.setAge(25.2);;
		wangxiaoer.setBirthday("1990-01-01");;
		wangxiaoer.setSchool("蓝翔");;
		wangxiaoer.setMajor(new String[] {"理发","挖掘机"});;
		wangxiaoer.setHas_girlfriend(false);;
		wangxiaoer.setCar(null);
		wangxiaoer.setHouse(null);;
		wangxiaoer.setComment("这是一个注释");
		wangxiaoer.setIgnore("不要看见我");
		GsonBuilder gsonBuilder=new GsonBuilder();
		gsonBuilder.setPrettyPrinting();
		gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {//回调函数
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
