package supar_Keyward;

public class Child_class extends Base_Class {

	int interset_rate = 10 ;
	public static void main(String[] args) {
		

		Child_class obj = new Child_class();
		System.out.println(obj.interset_rate);
		
		obj.ShowmeInterestRateFromPvtbannk();
		
	}
	
public void ShowmeInterestRate() {
		
		System.out.println("I am in Child Class" );
	}
	
public void ShowmeInterestRateFromPvtbannk() {
	ShowmeInterestRate();
	super.ShowmeInterestRate();
		System.out.println("Current ibr interest Rate for private bank is :"+super.interset_rate );
	}

}
