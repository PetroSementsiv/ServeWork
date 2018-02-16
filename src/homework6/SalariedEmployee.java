package homework6;

public class SalariedEmployee extends Employee implements FaceEmployee {


    public int hourlyRate;
    public int numberOfHours;
    public String socialSecurityNumber;

    @Override
    public double calculatePay() {

        return hourlyRate*numberOfHours;
    }


    public SalariedEmployee(String employeeId, int hourlyRate, int numberOfHours, String socialSecurityNumber) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }




}
