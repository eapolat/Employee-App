public class Department {
    
    private String deptName;
    private String deptCode;

    public Department (String name, String code) {

        deptName = name;
        deptCode = code;

    }
    public Department(Department other) {
        this.deptName = other.deptName;
        this.deptCode = other.deptCode;
    }

    public String accessor_deptName () {

        return deptName;

    }
    public String accessor_deptCode() {

        return deptCode;

    }

    public boolean hasSameDepartmentName(String department_to_control) {
        return (department_to_control.equals(deptName));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Department other = (Department) obj;
        return deptName.equals(other.deptName) && deptCode.equals(other.deptCode);
    }

    public String toString() {

        return String.format("DeptName: " + deptName + " Dept Code: " + deptCode);

    }

}
