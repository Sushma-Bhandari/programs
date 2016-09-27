package in.ac.kletech;

public class Car {
	String sName;
	String sColor;
	int imaxSpeed;
	int inoOfSeats;
	int iSpeed;
	
	Car(String Name,String Color,int maxSpeed,int noOfSeats){
		this.sName=Name;
		this.sColor=Color;
		this.imaxSpeed=maxSpeed;
		this.inoOfSeats=noOfSeats;
	}
	
	void accelerate(){
	
	}
	void Break(){

}
	class Ferrari extends Car{
		Ferrari(String Name,String Color,int maxSpeed,int noOfSeats,int Speed){
			super(Name,Color,maxSpeed,noOfSeats);
			this.iSpeed=Speed;
		}
		void accelerate(){
			iSpeed=iSpeed+2;
			if(iSpeed>imaxSpeed)
				iSpeed=imaxSpeed;
		}
		
		void Break(){
			iSpeed=iSpeed-40;
			if(iSpeed<0)
				iSpeed=0;
		}
		class BMW extends Car{
			BMW(String Name,String Color,int maxSpeed,int noOfSeats,int Speed){
				super(Name,Color,maxSpeed,noOfSeats);
				this.iSpeed=Speed;
			}
			void accelerate(){
				iSpeed=iSpeed+2;
				if(iSpeed>imaxSpeed)
					iSpeed=imaxSpeed;
			}
			
			void Break(){
				iSpeed=iSpeed-40;
				if(iSpeed<0)
					iSpeed=0;	
			
		}
			
			
			
		}
	}
}
	
