package cylinderdatahiding;

public class CylinderDataHiding {
private int radius;
private int height;

public CylinderDataHiding() {
	radius=0;
	height=0;
}
public CylinderDataHiding(int r) {
	radius=r;
	
}

public CylinderDataHiding(int r,int h) {
	radius=r;
	height=h;
}

public int getRadius()
{
	return radius;

}
public void setRadius(int r)
{
	if(radius>0)
	{
	  radius=r;
	}
	else
	{
		radius=0;
	}
}
public int getHeight()
{
	return height;

}
public void setHeight(int h)
{
	if(height>0)
	{
		height=h;
	}
	else
	{
		height=0;
	}
}
public void setDimentions(int r,int h)
{
	radius=r;
	height=h;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CylinderDataHiding c=new CylinderDataHiding();
		CylinderDataHiding c1=new CylinderDataHiding(4);
		CylinderDataHiding c2=new CylinderDataHiding(5,1);
		
		c1.setRadius(4);
		System.out.println(c1.getRadius());
		System.out.println(c2.getHeight()+" "+c2.getRadius());
	}

}
