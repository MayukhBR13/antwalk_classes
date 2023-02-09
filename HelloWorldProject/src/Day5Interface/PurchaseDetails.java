package Day5Interface;

public class PurchaseDetails implements Tax{
	@Override
	public String toString() {
		return "PurchaseDetails [purchaseID=" + purchaseID + ", paymentType=" + paymentType + ", taxPercent="
				+ taxPercent + "]";
	}
	String purchaseID;
	String paymentType;
	double taxPercent;
	
	public PurchaseDetails(String purchaseID, String paymentType) {
		super();
		this.purchaseID = purchaseID;
		this.paymentType = paymentType;
	}
	public String getPurchaseID() {
		return purchaseID;
	}
	public void setPurchaseID(String purchaseID) {
		this.purchaseID = purchaseID;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}
	public double calTax(double price) {
		if(paymentType=="Credit Card")
			taxPercent=2;
		else if(paymentType=="Debit Card")
			taxPercent=3;
		else
			taxPercent=4;
		return (price+ (price*taxPercent/100.0));
	}
}
