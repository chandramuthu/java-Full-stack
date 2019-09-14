
public class StringmethodsDemo {
public static void main(String[] args) {
	String s1="arjun";
	String s2="arjun";
	String s3="          Arjun   fgfhg dfhgfg";
	String s4=new String("vijay");
	String s5="vijay";
	System.out.println(s1.charAt(3));
	System.out.println(s1.codePointAt(0));
	System.out.println(s1.codePointBefore(3));
	System.out.println(s1.codePointCount(2,5));
	System.out.println("compareto s2"+s1.compareTo(s2));
	System.out.println("compareto s3"+s1.compareTo(s3));
	System.out.println("comparetoignore case"+s1.compareToIgnoreCase(s3));
	System.out.println(s4.concat(s4));
	System.out.println("compar fgfgeto s3"+s1.contains(s2));
	System.out.println(s1.contentEquals(s2));  //difference between equals and content equals??
	System.out.println(s1.endsWith("n"));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s3));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.hashCode());
	System.out.println(s1.getBytes());
	System.out.println(s1.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.indexOf("a"));
	System.out.println("replace"+s1.replaceAll(s1, s3));
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3.trim());
	System.out.println(s4);
}
}
