import java.util.Scanner;

/*public boolean twoE(String str)
{
  int count = 0;
  for (int i=0; i<str.length(); i++) {
    String sub = str.substring(i, i+1);
    if (sub.equals("e")) count++;
  }
  if (count == 2) return true;
  return false;
  // last 2 lines can be written simply as "return (count == 2);"
}*/
class Ex2
{

public static void main(String[] args)
             {
                 Scanner in = new Scanner(System.in);
 
 
               //finding the length of the Array studentNames
               System.out.print("how many students?:");
               int totalStudents = in.nextInt();
 
     String[] studentNames = new String [totalStudents];
 
        //allows user to input student names
 
    for(int j = 0; j < studentNames.length;j++) 
    {
        System.out.println(j);
        System.out.print("enter student names:");
        studentNames[j] = in.nextLine();
    }
 
        for (String element:studentNames)
        {   
       System.out.println(element);
        }
}

}