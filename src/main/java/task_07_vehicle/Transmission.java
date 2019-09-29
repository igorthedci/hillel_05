package task_07_vehicle;

import java.util.Arrays;

/**
 *  *     You should be able to hand steering, changing gears, and moving(speed in other words).
 *  *     You will want to decide where to put the appropriate state and behaviours(fields and methods).
 *  *     As mentioned above, changing gears, increasing/decreasing speed should be included.
 *  *     For you specific type of vehicle you will want to add something specific for that type of car.
 */
public class Transmission {
    private String name; // "auto", "manual"
    private int levels; // the number of transmission levels
    private int actualLevel = 0; // 0 is a neutral transmission
    private int[] speedLimits; // a speed limit for each level

    public Transmission(String name, int levels, int[] speeds) {
        this.name = name;
        this.levels = levels;
        this.actualLevel = 0;
        this.speedLimits = speeds;
//        this.speedLimits = new int[levels + 1];
//        for (int i = 0; i <= levels; i++) {
//            this.speedLimits[i] = speeds[i];
//        }
    }

    // GETTERs & SETTERs
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setLevels(int levels) { this.levels = levels; }
    public int getLevels() { return levels; }

    public void setActualLevel(int actualLevel) {
        if (actualLevel == this.actualLevel) return;
        this.actualLevel = (actualLevel > levels) ? levels : actualLevel; // actualLevel is limited by 'levels'
        System.out.println("Transmission: actual level: " + this.actualLevel);
    }
    public int getActualLevel() { return actualLevel; }

    public void setSpeedLimits(int[] speedLimits) { this.speedLimits = speedLimits; }
    public int[] getSpeedLimits() { return speedLimits; }

    // INFO
    public void info() {
        System.out.println(
                "Transmission info:" +
                "\n\tname: " + this.name +
                "\n\tactual level: " + this.actualLevel +
                "\n\tgear number: " + this.levels +
                "\n\tactual limit: " + this.speedLimits[actualLevel] +
                "\n\tspeed limits: " + Arrays.toString(this.speedLimits));
    }

    // ADJUST SPEED
    public int adjustSpeed(int aSpeed) {
        int aLevel = 0;
        if (aSpeed <= 0) {
            this.actualLevel = 0;
            setActualLevel(0);
            return 0;
        }
        if (this.name.equals("auto")) {
            for (int i = 1; i <= this.levels; i++) {
                if (aSpeed <= this.speedLimits[i]) {
                    aLevel = i;
                    break;
                }
            }
            if (aLevel > 0) {
                setActualLevel(aLevel);
                return aSpeed;
            } else {
                setActualLevel(this.levels);
                return this.speedLimits[this.levels];
            }
        } else {
            int aLimit = this.speedLimits[this.actualLevel];
            if (aSpeed > aLimit) {
                System.out.println(
                        "Transmission[" + actualLevel + "]: speed limit is " + aLimit);
                aSpeed = aLimit;
            }
            return aSpeed;
        }
    }
}
