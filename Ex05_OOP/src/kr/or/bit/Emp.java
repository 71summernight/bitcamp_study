package kr.or.bit;

public class Emp {
    
    private int empNo;
    private String eName;
    
    public Emp(int empNo, String eName) {
        this.empNo = empNo;
        this.eName = eName;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
    
    // Object가 가지는 toString을 재정의(override)
    @Override
    public String toString() {
        return "Emp [empNo=" + empNo + ", eName=" + eName + "]";
    }
    
}
