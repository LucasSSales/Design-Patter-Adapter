package Adapter;

/**
 * Created by misko on 19.1.2015.
 */
public class Main {

    public static void main(String[] args) {
    	System.out.println("CODE WITH ADAPTER");
        Human myself = new Person("Lucas Sales", 19);

        myself.think();
        myself.feel();
        
        System.out.println("");
        
        Human stone = new StoneAdapter(new Stone("granite", 25));

        stone.think();
        stone.feel();
       
        System.out.println("");
        
        Human robot = new RobotAdapter(new Robot("LSS097", 2025));
        
        robot.think();
        robot.feel();
     
    }
}
