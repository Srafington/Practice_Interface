package interface1;

public class House extends FixedProperty{
    protected int area;

    public House(String location, boolean inCity, double value, int area){
        super(location, inCity, value);
        this.area = area;
    }

    public int getArea(){
        return area;
    }

	
}