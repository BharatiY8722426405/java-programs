package AssignmentsPrograms;

import java.util.LinkedHashSet;

public class StringVowelWithoutDuplicate {

public static void main(String[] args) {
String s="india";
char ch[]=s.toCharArray();
LinkedHashSet<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<ch.length;i++) {
	set.add(ch[i]);
	
}
int count=0;
for(Character sa:set) {
	if(sa=='a'||sa=='e'||sa=='i'||sa=='o'||sa=='u')
	{
		count ++;
		System.out.print(sa);
	}
	
}
System.out.print("="+count);

	}

}