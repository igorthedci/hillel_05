/**
 * "3. Create a class Dog.
 * The dog should have a name and an age (private).
 * Create getters and setter for all the fields."
 */
package task_03_dog;

public class Dog {

    private String name;
    private int age;

    public Dog(int age, String name) {

        this.age = age;
        this.name = name;
    }

    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }


    public static void main(String[] args) {

    }
}
