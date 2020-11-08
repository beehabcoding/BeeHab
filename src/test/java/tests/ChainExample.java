package tests;

public class ChainExample {
    //                     Str   int   Str        double
    // Person information: name, age, occupation, salary

   private String name, occupation;
   private int age;
   private double salary;

    public static void main(String[] args) {
        ChainExample person = new ChainExample();
        person.setName("Beehab")
              .setAge(20)
              .setOccupation("Front end developer")
              .setSalary(120_000.00)
              .getInfo();
    }

   // setters and getters
    public ChainExample setName(String name){
        this.name = name;
        return this;
    }

    public ChainExample setOccupation(String occupation){
        this.occupation=occupation;
        return this;
    }

    public ChainExample setAge(int age){
        this.age=age;
        return this;
    }

    public ChainExample setSalary(double salary){
        this.salary = salary;
        return this;
    }

    // get the person information
    public void getInfo(){
        System.out.println("Name: "+name +"\n" +
                "Age: "+ age + "\n" +
                "Occupation: "+ occupation + "\n" +
                "Salary: " + salary);
    }




}
