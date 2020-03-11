package interface1;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		ArrayList<ITaxable> list=new ArrayList<>();

		TaxableHouse h1= new TaxableHouse("Aalborg", true, 700, 500000);
		TaxableHouse h2= new TaxableHouse("Skjern", true, 1800, 300000);
		TaxableBus b1= new TaxableBus(50, 12345, 300000);
		TaxableBus b2= new TaxableBus(10, 345678, 25000); 

		list.add(h1);
		list.add(h2);
		list.add(b1);
		list.add(b2);
		for(ITaxable item : list)
			//Console.WriteLine("{0}", it.TaxValue());
			System.out.println(item.TaxValue());

	}
}
