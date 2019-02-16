import java.util.Scanner;
import java.lang.String;

public class decode
{
	public void codedecode()
	{
		String s;
		int i=0,j=1,k;
		char reader;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a String to decode : ");
		s=sc.nextLine();
		int length = s.length();
		System.out.print("Enter Number Of Iterations (You may know number of iterations if this information belongs to you.): ");
		k=sc.nextInt();
		while(j<=k)
		{
		i=0;
		while(i<length)
		{
			reader=s.charAt(i);
			if(reader=='A'||reader=='a')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='o';
				s=String.valueOf(arrays);
			}
			else if(reader=='B'||reader=='b')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='t';
				s=String.valueOf(arrays);
			}
			else if(reader=='C'||reader=='c')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='p';
				s=String.valueOf(arrays);
			}
			else if(reader=='D'||reader=='d')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='m';
				s=String.valueOf(arrays);
			}
			else if(reader=='E'||reader=='e')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='y';
				s=String.valueOf(arrays);
			}
			else if(reader=='F'||reader=='f')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='i';
				s=String.valueOf(arrays);
			}
			else if(reader=='G'||reader=='g')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='l';
				s=String.valueOf(arrays);
			}
			else if(reader=='H'||reader=='h')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='w';
				s=String.valueOf(arrays);
			}
			else if(reader=='I'||reader=='i')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='n';
				s=String.valueOf(arrays);
			}
			else if(reader=='J'||reader=='j')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='x';
				s=String.valueOf(arrays);
			}
			else if(reader=='K'||reader=='k')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='d';
				s=String.valueOf(arrays);
			}
			else if(reader=='L'||reader=='l')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='k';
				s=String.valueOf(arrays);
			}
			else if(reader=='M'||reader=='m')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='j';
				s=String.valueOf(arrays);
			}
			else if(reader=='N'||reader=='n')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='s';
				s=String.valueOf(arrays);
			}
			else if(reader=='O'||reader=='o')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='r';
				s=String.valueOf(arrays);
			}
			else if(reader=='P'||reader=='p')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='a';
				s=String.valueOf(arrays);
			}
			else if(reader=='Q'||reader=='q')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='e';
				s=String.valueOf(arrays);
			}
			else if(reader=='R'||reader=='r')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='z';
				s=String.valueOf(arrays);
			}
			else if(reader=='S'||reader=='s')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='v';
				s=String.valueOf(arrays);
			}
			else if(reader=='T'||reader=='t')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='f';
				s=String.valueOf(arrays);
			}
			else if(reader=='U'||reader=='u')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='b';
				s=String.valueOf(arrays);
			}
			else if(reader=='V'||reader=='v')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='q';
				s=String.valueOf(arrays);
			}
			else if(reader=='W'||reader=='w')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='h';
				s=String.valueOf(arrays);
			}
			else if(reader=='X'||reader=='x')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='g';
				s=String.valueOf(arrays);
			}
			else if(reader=='Y'||reader=='y')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='u';
				s=String.valueOf(arrays);
			}
			else if(reader=='Z'||reader=='z')
			{
				char[] arrays=s.toCharArray();
				arrays[i]='c';
				s=String.valueOf(arrays);
			}
			i++;
		}
		j++;
		}
		System.out.println("Decoded Message : "+s);
		System.out.print("\n");
	}
}