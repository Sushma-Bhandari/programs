package in.ac.kletech;

public class PatientDemo {
	public static void main(String[] arg){
		Patient[] p=new Patient[10];
		p[0]=new Patient("patient1","uid1",1111);
		p[1]=new Patient("patient2","uid2",2222);
		p[2]=new Patient("patient3","uid3",2223);
	    p[3]=new Patient("patient4","uid4",2224);
	    p[4]=new Patient("patient5","uid5",2225);
        p[5]=new Patient("patient6","uid6",2226);
        p[6]=new Patient("patient7","uid7",2227);
        p[7]=new Patient("patient8","uid8",2228);
        p[8]=new Patient("patient9","uid9",2229);
        p[9]=new Patient("patient10","uid10",2230);
        
        int keyMob=2227;
        Patient pp=Patient.search(p,keyMob);
        
        if(pp==null)
        	System.out.println("no patient found");
        else
        {
        	System.out.println("patient found with following details");
        	System.out.println("name="+pp.name);
        	System.out.println("uid="+pp.uid);
        	System.out.println("mobileno="+pp.mobNum);
        }
        }
}
