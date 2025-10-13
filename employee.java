
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void compareSalary(Employee e) {
        if (this.salary > e.salary) {
            System.out.println(this.name + " has a higher salary than " + e.name);
        } else if (this.salary < e.salary) {
            System.out.println(e.name + " has a higher salary than " + this.name);
        } else {
            System.out.println(this.name + " and " + e.name + " have equal salaries.");
        }
    }

    public static void main(String[] args) {
      
        Employee emp1 = new Employee("Alice", 55000);
        Employee emp2 = new Employee("Bob", 60000);

   
        emp1.compareSalary(emp2);
    }
}

