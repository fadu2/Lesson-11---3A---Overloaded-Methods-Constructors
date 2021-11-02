public class Person {
    // instance variables
    private String name; // default value null
    private int age;  // default value 0
    private String job;  // default value null
    
    // double -- default value 0.0
    // boolean -- default value false 
    
    // Constructor #1
    public Person(String n, int a, String j)
    {
       // this.name = name;
        name = n;
        age = a;
        job = j;
    }
        // Constructor #1b - cannot have this constructor
//    public Person(String j, int a, String n)
//    {
//       // this.name = name;
//        name = n;
//        age = a;
//        job = j;
//    }
    // Constructor #2
    public Person()
    {
        name = "John Doe";
        age = 17;
        job = "Student";
    }
    
    // Overload requirements:
    // 1. different data types of parameters
    // 2. different order of parameters
    // 3. different number of parameters
    
    // Constructor #3
    public Person(String n, String j)
    {
        name = n;
        age = 21;
        job = j;
    }
    
    // Constructor #4
    public Person(int a)
    {
        name = "Jane Doe";
        age = a;
        job = "Teacher";
    }
    
    // method 
    public String ageInYear()
    {
        return name + " is " + age + " in 2021.";
    }
    
    public String ageInYear(int y)
    {
        int newAge = age + (y - 2021);
        return name + " will be " + newAge + " in " + y;
     }
    
    public double divideTwoNums(int a, int b)
    {
        return 1.0 * a / b;
    }
    
    public double divideTwoNums(double a, double b)
    {
        return a / b;
    }
    // Getters
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getJob()
    {
        return job;
    }
    
    public String toString()
    {
        return name + " is " + age + " years old and is a(n) " + job + ".";
    }
    
}
