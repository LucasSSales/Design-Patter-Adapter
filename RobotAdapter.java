package Adapter;

public class RobotAdapter implements Human {

	Robot robot;
	
	public RobotAdapter (Robot robot) {
		this.robot = robot;
	}

	@Override
	public String getName() {
		return robot.getCode();
	}

	@Override
	public int getAge() {
		return robot.getShelfLife();
	}

	@Override
	public void think() {
		robot.processData();
	}

	@Override
	public void feel() {
		robot.tryFeel();
	}

	@Override
	public void move() {
		robot.locomove();
	}

	@Override
	public void age() {
		robot.rust();
	}
	
	
	
}
