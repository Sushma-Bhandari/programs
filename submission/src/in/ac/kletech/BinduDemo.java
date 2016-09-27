package in.ac.kletech;

public class BinduDemo {
	public static void main(String[] args){
		Bindu3d[] b=new Bindu3d[5];
		int x=5,y=30,z=51;
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Bindu3D(z,x,y);
			x+=10;y+=10;z+=10;
		}
		Bindu3D.printArr(b);
	}

}
