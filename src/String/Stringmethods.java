package String;

public class Stringmethods {

	public static void main(String[] args) {
     String st="Well-come";
     System.out.println(st.length());
      String s1="hi";
      String s2="hello";
      String s3="wel-come";
      System.out.println(s1.concat(s2).concat(s3));
      System.out.println(st.charAt(1));
      System.out.println(st.indexOf('e'));
      
      String s4="hi";
      String s5="bye";
      String s6="good bye";
      String joined=String.join("", s4,s5,s6);
      
      String s7="Wel-come";
      System.out.println(s7.contains("om"));
      
      String s8="bharati";
      System.out.println(s8.startsWith("a"));
      
      String s9="bharatiy";
      System.out.println(s9.endsWith("y"));
      
      String s10="bharati";
      String s11="";
      System.out.println();
      
      
      
	}

}
