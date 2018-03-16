package Requiredstyle;
import Spring.Person;
public class Customer 
{
	private Person person;
	private int type;
	private String action;
	
	@Mandatory
	public void setPerson(Person person) {
		this.person = person;
	}
	//getter and setter methods

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Person getPerson() {
		return person;
	}
}
//这样做，创建了一个新的自定义命名 @Required-style的@Mandatory 注解，相当于 @Required 注解
