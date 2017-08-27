package Adapter;

/**
 * Created by misko on 19.1.2015.
 */
public class Main {

    public static void main(String[] args) {
        Human myself = new Person("Lucas Sales", 19);

        myself.think();
        myself.age();
        myself.move();
        
        System.out.println("");
        
        Human stone = new StoneAdapter(new Stone("granite", 25));

        stone.think();
        stone.age();
        stone.move();
        
        System.out.println("");
        
        Human robot = new RobotAdapter(new Robot("LSS098", 2025));
        
        robot.think();
        robot.age();
        robot.move();
        
    }
}
