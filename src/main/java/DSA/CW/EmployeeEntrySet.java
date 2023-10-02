package DSA.CW;

public class EmployeeEntrySet {
	private String name;
    private int age;
    private int id;

  public EmployeeEntrySet(String name, int age, int id) {
	  this.name = name;
	  this.age = age;
	  this.id = id;
  }
  
  public String getName() {
	  return name;
  }
  
  public int getAge() {
	  return age;
  }
  
  public int getId() {
	  return id;
  }
  
  public static void main(String[] args) {
	  EmployeeEntrySet emp1 = new EmployeeEntrySet("Annie",30,101);
	  EmployeeEntrySet emp2 = new EmployeeEntrySet("Zarah",20,101);
	  EmployeeEntrySet emp3 = new EmployeeEntrySet("Amaya",30,101);
	  EmployeeEntrySet emp4 = new EmployeeEntrySet("Sweety",23,101);
	  EmployeeEntrySet emp5 = new EmployeeEntrySet("Ananya",25,101);
	  
	  Set<Map.Entry<String, EmployeeEntrySet>> entryset
  }
}
