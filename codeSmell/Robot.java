package codeSmell;

public class Robot implements Human{
	
	private String code;
	private int shelfLife;
	
	
	public Robot(String code, int shelfLife) {
		setCode(code);
		setShelfLife(shelfLife);
	}
		
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}

	public void processData() {
		System.out.println(code + " is processing data");
	}
	
	public void tryFeel() {
		System.out.println(code + " is tring to feel, but it's not working yet");
	}
	
	public void locomove() {
		System.out.println(code + " is locomoving by wheels");
	}
	
	public void rust() {
		System.out.println("Until " + shelfLife + ", " + code + " is getting rusty");
	}
	
	
	@Override
	public String getName() {
		return getCode();
	}

	@Override
	public int getAge() {
		return getShelfLife();
	}

	@Override
	public void think() {
		processData();
	}

	@Override
	public void feel() {
		tryFeel();
	}

	@Override
	public void move() {
		locomove();
	}

	@Override
	public void age() {
		rust();
	}
	
	
}
