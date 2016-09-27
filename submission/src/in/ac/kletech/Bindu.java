package in.ac.kletech;

public class Bindu {
	int x,y;
	
	Bindu(int x,int y){
		this.x=x;
		this.y=y;
	}
	String getData()
	{
		return "x="+x "y="+y;
	}
	final static void printArr(Bindu[] b){
		if(b!=null)
		{
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i].getData());
			}
		}
	}

}
class Bindu3D extends Bindu{
	int z;
	Bindu3D(int z,int x,int y){
		super(x,y);
		this.z=z;
		}
	String getData(){
		return super.getData()+"z="+z;
	}
}
