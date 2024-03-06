package guvi_task2_Q1;
 class Person {
    private String name;
    private int age;

    // Default constructor with default age set to 18
    public Person() {
        this.age = 18;
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age of person
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a person object using default constructor
        Person person1 = new Person();
        person1.display();

        // Creating a person object using parameterized constructor
        Person person2 = new Person("santhosh", 24);
        person2.display();
    }
}
 
// output
// Name: null
// Age: 18
// Name: santhosh
// Age: 24
