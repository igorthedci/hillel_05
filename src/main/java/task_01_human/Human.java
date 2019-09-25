package task_01_human;

/**
 * "1. Create a class ""task_01_human.Human"".
 * A human should have the following attributes:
 * weight, age, first name, last name, height."
 *
 * "1) Create a class Human with all the required fields to store the information
 * (variable types you could choose by yourself).
 * 2) Add to the class a constructor with parameters which initialize all the fields."
 */
public class Human {

    private int age;
    private String first_name;
    private String last_name;
    private double height;
    private double weight;

    public Human(int age, String first_name, String last_name, double height, double weight) {

        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
        this.height = height;
        this.weight = weight;


    }
}

