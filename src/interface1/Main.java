package interface1;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		ArrayList<ITaxable> list=new ArrayList<>();

		TaxableHouse h1= new TaxableHouse("Aalborg", true, 700, 500000);
		TaxableHouse h2= new TaxableHouse("Skjern", true, 1800, 300000);
		int regno=12345;
		double velocity=50;
		double value= 300000;
		int numberofseat=50;
		TaxableBus b1= new TaxableBus(numberofseat, regno, value,velocity);
		//TaxableBus b2= new TaxableBus(10, 345678, 25000,10); 

		list.add(h1);
		list.add(h2);
		list.add(b1);
		list.add(b2);
		for(ITaxable item : list)
			//Console.WriteLine("{0}", it.TaxValue());
			System.out.println(item.TaxValue());

	}
}
