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
//��������������һ���µ��Զ������� @Required-style��@Mandatory ע�⣬�൱�� @Required ע��
