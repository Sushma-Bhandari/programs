package javaoop;

public class MyNamedemo {
	public static void main(String[] args)
	{
	MyName sushma=new MyName("sss","ppp","rrr");
	MyName smita=new MyName("aa","bb","cc");
	
	System.out.println(sushma.getPrivateName());
	System.out.println(sushma.publicName);
	System.out.println(sushma.defaultName);
	System.out.println(smita.getPrivateName());
	System.out.println(smita.publicName);
	System.out.println(smita.defaultName);
	}

}
