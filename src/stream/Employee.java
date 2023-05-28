package stream;

public class Employee {
    private int eid;
    private String ename;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eaddress=" + eaddress +
                '}';
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Address getEaddress() {
        return eaddress;
    }

    public void setEaddress(Address eaddress) {
        this.eaddress = eaddress;
    }

    public Employee(int eid, String ename, Address eaddress) {
        this.eid = eid;
        this.ename = ename;
        this.eaddress = eaddress;
    }

    private Address eaddress;

}
