class Arguments1
{
static int x=20;
static int y=10;
static int addTwo(int a,int b)
{

int c=a+b;
return c;


}
static int subTwo(int a,int b)
{
int c=a-b;
return c;

}

public static void main(String a[])
{
System.out.println(Arguments1.addTwo(10,20)); //Printing
System.out.println(Arguments1.addTwo(50,20));
System.out.println(Arguments1.subTwo(20,10));
System.out.println(Arguments1.subTwo(50,10));
System.out.println("This is my 4th program");
}
}