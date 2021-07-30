package JDBCTest;

public class Member {

	private String id;
	private String pw;
	private String name;
	private String birth;
	private int age;
	private String addr;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", "
				+ "birth=" + birth + ", age=" + age + ", addr="
				+ addr + "]";
	}
	
	public Member() {
		super();
	}
	
	public Member(String id, String pw, String name, String birth, int age, String addr) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.addr = addr;
	}
	
	
	
	
	
	
	
	
	
}
