package chap04;

class PoorDog{
	private int size;
	private String name;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int asize) {
		size = asize;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String aname) {
		name = aname;
	}
}
public class PoorDogTestDrive {

	public static void main(String[] args) {
		PoorDog one = new PoorDog();
		System.out.println("size : "+one.getSize());
		System.out.println("name : "+one.getName());
	}

}
