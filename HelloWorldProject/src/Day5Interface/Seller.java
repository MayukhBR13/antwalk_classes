package Day5Interface;

public class Seller implements Tax{
	String location;
	double taxPercent;
	
	public Seller(String location) {
		super();
		this.location = location;
	}
	@Override
	public String toString() {
		return "Seller [location=" + location + ", taxPercent=" + taxPercent + "]";
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}
	public double calTax(double price) {
		if(location=="India")
			taxPercent=10;
		else if(location=="Erope")
			taxPercent=20;
		else if(location=="Us")
			taxPercent=15;
		else if(location=="Canada")
			taxPercent=25;
		return (price+ (price*taxPercent/100.0));
	}
}
