package heloo;

public class Encapsulation {
	private String name;
	private int age;
	private  int runs;
	public String   getName() {
		return name;
		
	}
	public void  setName(String name) {
		this.name=name;
		
	}
	public int getAge() {
		return age;
		
	}
	public void  setAge(int age) {
		this.age=age;
		
	}
	public int getRuns() {
		return runs;
		
	}
	public void  setRuns(int runs) {
		this.runs=runs;
		
	}
	public String toString() {
		return "name"+" " + name +" " + "Age:"+ age +" " + "runs" +runs ;
		
	}
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setName("king");
		e.setAge(20);
		e.setRuns(80);
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getRuns());
		System.out.println(e.toString());
		
		
	}

}
