package material;
import stock.Inventory;
public class Accessories extends Inventory {
	static int uId_gen=0;
	private String model;
	private String itemName;
	private int uId;
	
	static {
		Inventory.quantity
	}
	
	public Accessories(String model,String itemName,int quantity) {
		super(quantity, 5);
		// TODO Auto-generated constructor stub
		this.model=model;
		this.itemName=itemName;
		this.uId=uId_gen;
		uId_gen++;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
