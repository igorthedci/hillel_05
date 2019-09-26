/**
 * "3. Create a class Dog.
 * The dog should have a name and an age (private).
 * Create getters and setter for all the fields."
 */
package task_03_dog;

public class Dog {

    private String name;
    private int age;

    private String defaultName = "Dog";
    private int defaultAge = 1;

    // CONSTRUCTORS
    public Dog() {
        this.name = defaultName;
        this.age = defaultAge;
    }
    public Dog(int age) {
        this.name = defaultName;
        this.age = (age > 0) ? age : defaultAge;
    }
    public Dog(String name) {
        this.name = name.isEmpty() ? defaultName : name;
        this.age = defaultAge;
    }
    public Dog(int age, String name) {
        this.age = (age > 0) ? age : defaultAge;
        this.name = name.isEmpty() ? defaultName : name;
    }

    // AGE - getter, setter
    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = (age > 0) ? age : defaultAge; }

    // NAME - getter, setter
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name.isEmpty() ? defaultName : name; }

}
