package interface1;

public class FixedProperty {
	 protected String location;
	  protected boolean inCity; 
	  protected double estimatedValue;

	  public FixedProperty(String location, boolean inCity, double value){
	    this.location = location;
	    this.inCity = inCity;
	    this.estimatedValue = value;
	  }

	  public FixedProperty(String location) {
	    this(location,true,1000000);
	  }

	  public String getLocation(){
	    
	      return location;
	    
	  }
}
