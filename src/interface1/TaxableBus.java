package interface1;

public class TaxableBus extends Bus implements ITaxable{

    public TaxableBus(int registrationNumber, double maxVelocity, double value, int numberOfSeats){
        super(registrationNumber, maxVelocity, value, numberOfSeats);
    }
    @Override
	public double TaxValue(){
        return value * 0.01 * numberOfSeats;
    }
}
