package sample1;

public class All_method {
public static void main(String[] args) {
	m1();
	All_method a1=new All_method();
	a1.m2();
	
}
public static void m1()
{
	int a=20,b=30;
	if(a>18)
	{
		System.out.println("the condition was true ="+(a+b));
		
	}
	else if(b>28)
	{
		System.out.println("the condition was true="+(a-b));
	}
	else
	{
		System.out.println("the condition was fail");
	}
}
public void m2()
{
	//for loop
	for(int a=1;a<=18;a++)
	{
		System.out.println("A="+a);
	}
	
	//nested if conditional statement
	
	int age=18,weight=50;
	if(age>=18)
	{
		System.out.println("eligible for blood donation by age criteria");
		if(weight>=50)
		{
			System.out.println("eligible for blood donation by weight criterria");
		}
		else
		{
			System.out.println("fail due to weight");
		}
	}
	else
	{
		System.out.println("fail by age");
	}
	
	//while loop
	int rollnum=20;
	while(rollnum<=24)
	{
		System.out.println(rollnum);
		rollnum++;
	}
}
}
