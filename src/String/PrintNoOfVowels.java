package String;

public class PrintNoOfVowels {

	public static void main(String[] args) {
String str="bharati";
int count=0;
char[] ch=str.toCharArray();
for(int i=0;i<ch.length;i++)
{
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	{
		count++;
		
	}
}
System.out.println(count);

	}
	

}
