package Adapter;

/**
 * Created by misko on 19.1.2015.
 */
public class StoneAdapter implements Human {

    private Stone stone;

    public StoneAdapter(Stone stone) {
        this.stone = stone;
    }

    @Override
    public String getName() {
        return stone.getType();
    }

    @Override
    public int getAge() {
        return stone.getWeight();
    }

    @Override
    public void think() {
        stone.describe();
    }

    @Override
    public void feel() {
        stone.smash();
    }

	@Override
	public void move() {
		stone.stay();
		
	}

	@Override
	public void age() {
		stone.erosion();
		
	}
}
