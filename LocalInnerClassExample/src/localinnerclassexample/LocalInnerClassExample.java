package localinnerclassexample;
class Outer{
	public void display() {
		class Inner{
			void innerDisplay()
			{
				System.out.println("Local inner class display method");
			}
		}
		Inner i=new Inner();
		i.innerDisplay();
	}
}
public class LocalInnerClassExample {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.display();

	}

}
