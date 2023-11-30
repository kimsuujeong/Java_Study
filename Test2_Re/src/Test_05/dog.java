package Test_05;

public class dog extends cat{
	
	int age;
	String sound;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	public String getBreed() {
		// TODO Auto-generated method stub
		return super.getBreed();
	}
	@Override
	public void setBreed(String breed) {
		// TODO Auto-generated method stub
		super.setBreed(breed);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public dog(String name, String breed) {
		super(name, breed);
		// TODO Auto-generated constructor stub
	}
	public dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public dog(String name, String breed, int age, String sound) {
		super(name, breed);
		this.age = age;
		this.sound = sound;
	}
	
	public static void main(String[] args) {
		dog dog1 = new dog("치와와", "남자", 12, "오락ㅇㄹㄹ올ㅇ뢍ㄱ");
		dog dog2 = new dog("비숑", "여자", 11, "갸우뚱?");
		dog dog3 = new dog("포메", "여자", 11, "뭘봐");
		
		System.out.print(dog1.name);
		System.out.print(",");
		System.out.print(dog1.breed);
		System.out.print(",");
		System.out.print(dog1.age);
		System.out.print(",");
		System.out.println(dog1.sound);
		
		System.out.print(dog2.name);
		System.out.print(",");
		System.out.print(dog2.breed);
		System.out.print(",");
		System.out.print(dog2.age);
		System.out.print(",");
		System.out.println(dog2.sound);
		
		System.out.print(dog3.name);
		System.out.print(",");
		System.out.print(dog3.breed);
		System.out.print(",");
		System.out.print(dog3.age);
		System.out.print(",");
		System.out.print(dog3.sound);
	}
	

}
