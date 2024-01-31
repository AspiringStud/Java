package overriding;

class TV{
	public void switchON()
	{
		System.out.println("TV is Switched ON");
	}
	public void changeChannel()
	{
		System.out.println("TV channel is changed");
	}
}

class SmartTV extends TV{
	@Override
	public void switchON()
	{
		System.out.println(" Smart TV is Switched ON");
	}
	@Override
	public void changeChannel()
	{
		System.out.println(" Smart TV channel is changed");
	}
	public void browse()
	{
		System.out.println("Smart Tv Browsing");
	}
}


public class Overriding {

	public static void main(String[] args) {
		TV t=new TV();
		SmartTV s=new SmartTV();
		TV t1 = new SmartTV();
		
		s.switchON();
		s.changeChannel();
		s.browse();
		
		t.switchON();
		t.changeChannel();
		
		t1.changeChannel();

	}

}
