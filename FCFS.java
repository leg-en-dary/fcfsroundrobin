import java.util.Scanner;

class fcfslogic
{
		int i,j,n;
		int pid[],wt[],tat[],bt[],at[];
		int ct[];
		Scanner scan=new Scanner(System.in);
		
		fcfslogic()
		{
			i=j=n=0;
			ct=new int [100];
			pid=new int[100];
			bt=new int[100];
			tat=new int[100];
			wt=new int[100];
			at=new int [100];
		}
		
		public void accept()
		{
			System.out.println("Enter number of proceeses :\n");
			n=scan.nextInt();
			
			for(i=0;i<n;i++)
			{
				pid[i]=i+1;
			}
			System.out.println("Enter burst time");
			for(i=0;i<n;i++)
			{
				bt[i]=scan.nextInt();
			}			
			System.out.println("Enter Arrival time");
			for(i=0;i<n;i++)
			{
				at[i]=scan.nextInt();
			}			
		}
		
		public void display()
		{
			System.out.println("Table :-");
			System.out.println("pid\t bt\tat\t CT\twt \t tat \t ");
			for(i=0;i<n;i++)
			{
				System.out.println(pid[i]+"\t"+bt[i]+"\t"+at[i]+"\t"+ct[i]+"\t"+wt[i]+"\t"+tat[i]+"\t");				
			}			
		}
		
		public void findall()
		{
			
			int t=0;
			for(i=0;i<n;i++)
			{
				ct[i]=t+bt[i];
				t=ct[i];	
			}
			for(i=0;i<n;i++)
			{
				tat[i]=ct[i]-at[i];
			}

			for(i=0;i<n;i++)
			{
				wt[i]=tat[i]-bt[i];
			}			
		}
		
		public void findavg()
		{
			int total_wt=0;
			int total_tat=0;
			
			for(i=0;i<n;i++)
			{
				total_wt=total_wt+wt[i];
			}
			double avgwt=(float)total_wt/n;			
			System.out.println("avg wt :-");
			System.out.println(avgwt);
			
			for(i=0;i<n;i++)
			{
				total_tat=total_tat+tat[i];
			}
			System.out.println("avg tat :-");
			double avgtat=(float)total_tat/n;		
			System.out.println(avgtat);
		}
}

public class FCFS 
{
	public static void main(String args[])
	{
		fcfslogic fc = new fcfslogic();
		fc.accept();
		fc.findall();
		fc.display();
		fc.findavg();
	}
}
