package employee;

public abstract  class Person implements EmployeeAction {
    private String name;
    private int ID;
    private  int age;

    public Person(int age , int ID , String name){
        this.ID = ID;
        this.name = name;
        this.age = age;
    }
    public Person(){
        ID = 0;
        age = 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(getClass() == obj.getClass())  return this.ID == ((Person) obj).ID;
        return  false;
    }

    @Override
    public String toString() {
        return getClass().getName() + " @Name: " + name + "\n Age: " + age + "\n ID: " + ID + "\n";
    }

    @Override
    public int hashCode() {
        return ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
