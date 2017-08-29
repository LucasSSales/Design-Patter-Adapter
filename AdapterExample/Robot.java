package Adapter;

public class Robot {
	
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
		System.out.println(code + " is tring to feel, but it's not working and he will die until "+ shelfLife);
	}	
}
