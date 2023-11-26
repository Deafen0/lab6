package employee;

public interface EmployeeAction {
    void dissmissEnployee();
    boolean  ISdissmissEnployee();
    int getID();
    void  setID( int ID);
    void setName(String name);
    String getName();
    void setAge(int age);
    int getAge();
}
