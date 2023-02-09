package material;
import stock.Inventory;
public class Laptops extends Inventory{
	static int uId_gen=0;
	private String model;
	private int storage;
	private int uId;
	
	public Laptops(String model,int storage,int quantity) {
		super(quantity, 3);
		// TODO Auto-generated constructor stub
		this.model=model;
		this.storage=storage;
		this.uId=uId_gen;
		uId_gen++;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	
}
