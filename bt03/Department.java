package baitap.bt03;

public class Department {
    private String departmentId,departmentName ;
    private int totalMembers;

    public Department() {
    }

    public Department(String departmentId, String departmentName, int totalMembers) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.totalMembers = totalMembers;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }
    public void displayData(){
        System.out.println("Id: "+this.departmentId);
        System.out.println("Name: "+this.departmentName);
        System.out.println("Total Employee"+this.totalMembers);
        System.out.println("----------------------------------");
    }
}
