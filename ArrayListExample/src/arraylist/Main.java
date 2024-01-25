package arraylist;

public class Main {

	public static void main(String[] args) {
		ModArrayList list = new ModArrayList();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(30);
        
		System.out.println(list.getUsingMod(0));
		System.out.println(list.getUsingMod(-3));
		System.out.println(list.getUsingMod(20));
	}

}
