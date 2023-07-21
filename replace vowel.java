import java.util.Scanner;
class replacevowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		string[] a=sc.nextString();
		char[] s=a.tocharArray();
		int i;
		for(i=0;i<s.length;i++)
		{
		  if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
		  {
		    s[i]=" ";
			}
			}
		System.out.print(+s);
		}
		}
          		