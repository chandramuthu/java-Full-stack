class Global
{
static int x=20;
static int y=10;
static void addTwo()
{
int a=123;
int b=124;
int c=a+b;
System.out.print("addition of two numbers"+c);
System.out.print("addition of two numbers"+(x+y));
}
static void subTwo()
{
int a=123;
int b=124;
int c=a-b;
System.out.print("sub of two numbers"+c);
System.out.print("sub of two numbers"+(x-y));
}

public static void main(String a[])
{
Global.addTwo();
Global.subTwo();
System.out.println("This is my 2nd program");
}
}