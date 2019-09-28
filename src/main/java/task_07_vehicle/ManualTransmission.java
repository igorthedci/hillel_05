package task_07_vehicle;
/**
 *  *     You should be able to hand steering, changing gears, and moving(speed in other words).
 *  *     You will want to decide where to put the appropriate state and behaviours(fields and methods).
 *  *     As mentioned above, changing gears, increasing/decreasing speed should be included.
 *  *     For you specific type of vehicle you will want to add something specific for that type of car.
 */
public class ManualTransmission {
    int
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

}
