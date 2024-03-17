
package Encapsulation;

public class Student {
    private String firstName,lastName;
    private int age;
    private boolean isMinor;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age<18;
    }
    
public String getName() {
        return lastName + ", " + firstName;
    }

    public void increaseAge() {
        age++;
        isMinor = age < 18;
    }
    
    public String toString() {
        String status = isMinor ? "minor" : "adult";
        return getName() + " - " + age + " - " + status;
    }
}
