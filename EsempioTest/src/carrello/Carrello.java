package carrello;

public class Carrello {
private int amount;
	
	
	
	public Carrello() {
		amount = 0;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void insertOneProduct() {
		amount++;
	}
	
	public void removeOneProduct() {
		if(amount > 0)
		amount--;
	}
        System.out.println("Ciao");
	
}



