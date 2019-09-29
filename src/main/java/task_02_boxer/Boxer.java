/**
 *  2. Implement the method fight() depending on weight, strength and age of the boxer:
 *         You should write dependency by yourself.
 *         The method should return true or false if our boxer won or lost.
 */
package task_02_boxer;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        // write your code here
        double victoryRate = 1.00;

        victoryRate *= (double) this.age / anotherBoxer.age;
        victoryRate *= (double) this.weight / anotherBoxer.weight;
        victoryRate *= (double) this.strength / anotherBoxer.strength;

        return victoryRate > 1;
    }

    public static void main(String[] args) {

    }
}