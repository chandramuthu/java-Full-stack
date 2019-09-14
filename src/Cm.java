public class Cm{  
    int id;  
    String name;  
    Cm(int id,String name){  
    id = id;  
    name = name;  
    }  
    void display(){System.out.println(id+" "+name);}
    public static void main(String args[]){  
    	Cm s1 = new Cm(111,"Karan");  
    	Cm s2 = new Cm(321,"Aryan");  
    s1.display();  
    s2.display();  }  }
