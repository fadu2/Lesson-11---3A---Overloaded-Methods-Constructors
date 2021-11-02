class Main {
  public static void main(String[] args) {
        // Signature of a method is the name and list of parameters.
        // An overloaded method is multiple methods with the same name and different parameters.
        Person p1 = new Person("Mike Smith", 27, "Programmer");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        Person p2 = new Person();
        System.out.println(p2.getName()); // John Doe 
        Person p3 = new Person("Joe Jones", "Architect");
        System.out.println(p3.getJob());
        System.out.println(p3.getAge());
        Person p4 = new Person(34);
        System.out.println(p4);
        System.out.println(p4.ageInYear());
        System.out.println(p4.ageInYear(2030));
        System.out.println(p4.divideTwoNums(4,3));
        System.out.println(p4.divideTwoNums(9, 4.5));
  }
}