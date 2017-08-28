package codeSmell;

/**
 * Created by misko on 19.1.2015.
 */
public class Stone implements Human {
	
    private int weight;
    private String type;

    public Stone(String type, int weight) {
        this.weight = weight;
        this.type = type;
    }

    public void describe() {
        System.out.println("This is " + type + " it weights " + weight + " kilos.");
    }

    public void smash() {
        System.out.println("This stone has been smashed away");
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
    

    @Override
    public String getName() {
        return getType();
    }

    @Override
    public int getAge() {
        return getWeight();
    }

    @Override
    public void think() {
        describe();
    }

    @Override
    public void feel() {
        smash();
    }
    
}

