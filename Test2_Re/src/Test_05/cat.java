package Test_05;

public class cat extends Animal{

	String breed;

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

	public cat(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
}
