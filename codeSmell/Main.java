package codeSmell;

/**
 * Created by misko on 19.1.2015.
 */
public class Main {

    public static void main(String[] args) {
    	System.out.println("CODE WITHOUT ADAPTER");
        Human myself = new Person("Lucas Sales", 19);

        myself.think();
        myself.feel();
        myself.age();
        myself.move();
        
        System.out.println("");
        
        Human stone = new Stone("granite", 25);

        stone.think();
        stone.feel();
        stone.age();
        stone.move();
        
        System.out.println("");
        
        Human robot = new Robot("LSS098", 2025);
        
        robot.think();
        robot.feel();
        robot.age();
        robot.move();
        
    }
}
