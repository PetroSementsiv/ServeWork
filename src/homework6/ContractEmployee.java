package homework6;

public class ContractEmployee extends Employee implements FaceEmployee {

    public int fixedMountlyPay;
    public String federalTaxIdmember;


    @Override
    public double calculatePay( ) {
        return fixedMountlyPay;
    }

    public ContractEmployee(String employeeId) {
        super(employeeId);
        // TODO Auto-generated constructor stub
    }


    public ContractEmployee(String employeeId, int fixedMountlyPay, String federalTaxIdmember) {
        super(employeeId);
        this.fixedMountlyPay =fixedMountlyPay ;
        this.federalTaxIdmember = federalTaxIdmember;
    }







}
