package interface1;

class TaxableHouse extends House  implements ITaxable{
    public TaxableHouse(String location, boolean inCity, double value, int area){
        super(location, inCity, value, area);
    }

	@Override
	public double TaxValue() {
        double taxVal;
        if(inCity){
            taxVal = 0.005 * estimatedValue * area;
        } else {
            taxVal = 0.001 * estimatedValue * area;
        }
		return taxVal;
	}

}