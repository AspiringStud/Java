package interfaceexample;

class Phone{
	public void call()
	{
	   System.out.println("Phone call");
	}
	public void sms() {
		System.out.println("Send a message in phone");
	}
}
interface ICamera
{
	void click();
	void record();
}
interface IMusicPlayer
{
	void play();
	void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer{
	public void videocall()
	{
		System.out.println("Smart phone video calling");
	}
	@Override
	public void click() {
		System.out.println("Smart phone clicking photo");
	}
	@Override
	public void record()
	{
		System.out.println("Smart phone recording video");
	}
	@Override
	public void play()
	{
		System.out.println("Smart phone playing music");
	}
	@Override
	public void stop()
	{
		System.out.println("Smart phone stopping the music played");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		Phone p=s;
		ICamera c=s;
		IMusicPlayer m=s;
		s.videocall();
		p.call();
		p.sms();
		c.click();
		c.record();
		m.play();
		m.stop();

	}

}
