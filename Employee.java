public class Employee {
    
    final static int WORKING_DAYS = 261;

    private String employeeName;
    private double dailyRate;
    private String department;
    private String project;
    public Department new_department;

    public Employee(String name, double rate, String project_1, String department_name, String department_code){

        employeeName = name;
        dailyRate = rate;
        project = project_1;

        this.new_department = new Department(department_name, department_code);

    }


    public Employee(Employee E){

        this.employeeName = E.employeeName;
        this.dailyRate = E.dailyRate;
        this.project = E.project;
        this.new_department = new Department(E.new_department); 

    }


    public String accessor_employeeName() {

        return employeeName;

    }
    public  double accessor_dailyRate() {

        return dailyRate;

    }
    public  String accessor_department() {

        return department;

    }
    public  String accessor_project() {

        return project;

    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public  void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public  void setDepartment(String department) {
        this.department = department;
    }

    public  void setProject(String project) {
        this.project = project;
    }
    
    public  double calculateYearlySalary() {

        double yearlySalary = dailyRate * WORKING_DAYS;
        return yearlySalary;
    }

    public String toString() {

        String department_toString = new_department.toString();


        if (this.new_department != null) {
            return String.format("Employee Name: " + employeeName + " Yearly Salary: " + calculateYearlySalary() + "%n" + department_toString);
        } else {
            return String.format("Employee Name: " + employeeName + " Yearly Salary: " + calculateYearlySalary() + "%nDepartment: N/A");
        }
    }

}
