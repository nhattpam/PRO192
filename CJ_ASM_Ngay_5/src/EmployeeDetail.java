public class EmployeeDetail {
    String empCode;
    String name;
    String address;

    public EmployeeDetail(String empCode, String name, String address) {
        this.empCode = empCode;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nEmployee code: "+ empCode + "\nName: " + name + "\nAddress: " + address;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
