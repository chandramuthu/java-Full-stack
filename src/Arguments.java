class Arguments
{
static int x=20;
static int y=10;
static void addTwo(int a,int b)
{

int c=a+b;
System.out.print("addition of two numbers"+c);

}
static void subTwo(int a,int b)
{
int c=a-b;
System.out.print("sub of two numbers"+c);

}

public static void main(String a[])
{
Arguments.addTwo(10,20);
Arguments.addTwo(50,20);
Arguments.subTwo(20,10);
Arguments.subTwo(50,10);
System.out.println("This is my 4th program");
}
}