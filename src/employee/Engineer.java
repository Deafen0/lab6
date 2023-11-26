package employee;

public class Engineer extends Person{
    private int branchID;
    private  boolean status ;

    public Engineer(){
        super();
    }

    public Engineer(int age , int ID , String name, int branchID){
        super(age,ID,name);
        this.branchID = branchID;
        this.status = true;
    }

    @Override
    public void dissmissEnployee( ) {
        status = false;
    }

    @Override
    public boolean ISdissmissEnployee() {
        return status;
    }

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    @Override
    public String toString() {
        return super.toString() + " BranchID: " + branchID + "\n" + " Status: " + status + "\n";
    }
}
