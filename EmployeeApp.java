public class EmployeeApp {
    
    public static void main(String[] args) {

        Project project = new Project("SunMarkets POS Implementation", 450, 12, 100);

        Employee employee1 = new Employee("Karakus, Zana", 100, "SunMarkets POS Implementation", "Information Technology", "IT");
        Employee employee2 = new Employee("Rocca, Denis", 120, "SunMarkets POS Implementation", "Human Resources", "HR");
        Employee employee3 = new Employee("Anders, Jamie", 90, "SunMarkets POS Implementation", "Human Resources", "HR");
        
        Employee employeeCopy = new Employee(employee1);
    

        System.out.println("Employees:");
        System.out.println();
    
        System.out.println(employee1.toString());

        System.out.println(project.toString());
        System.out.println();

        System.out.println(employee2.toString());

        System.out.println(project.toString());
        System.out.println();

       System.out.println(employee3.toString());

        System.out.println(project.toString());
        System.out.println();

        System.out.println(employeeCopy.toString());
        System.out.println(project.toString());
        System.out.println();

        System.out.println("--------- end employee list ----------");
        System.out.println();
        
        compareDepartments(employee1, employee2, employee3, employeeCopy);
             
    }
        
    public static void compareDepartments(Employee... employees) {
    
        System.out.println("_____________________");

        System.out.println();

        Project project = new Project("SunMarkets POS Implementation", 450, 12, 100);

        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].new_department.equals(employees[j].new_department)) {
                    System.out.println("Employees with Matching Departments  (" + (i+1) + ")");
                    System.out.println();
                    System.out.println(employees[i].toString());
                    System.out.println(project.toString());

                    System.out.println();

                    System.out.println(employees[j].toString());
                    System.out.println(project.toString());
                    System.out.println();   
                    
                }   
            }   
        }   
    }    
}
