import java.util.*;

class Driver 
{

	public static void main(String[]args)
	{

		int permit=1;
		StackAL<Integer> r1=new StackAL<Integer>(10);
		StackLL<Integer> r2=new StackLL<Integer>();		
		Scanner sc=new Scanner(System.in);


		loop: 
		for(Integer j=0;j<10;j++){

		System.out.println("1.ArrayList");
		System.out.println("2.LinkList");
		System.out.println("3.exit");
		System.out.println();
		
		int choice=sc.nextInt();

		if(choice==1)
		{

			while(permit==1)
		{
		
		System.out.println("1.push");
		System.out.println("2.peek");
		System.out.println("3.pop");
		System.out.println("4.Display size");
		System.out.println("5.exit to main menu");
		System.out.println();					
		int x=sc.nextInt();

		
		switch(x)
		{
		
			case 1:
				{
				System.out.println();
				int a=sc.nextInt();
					Integer b=a;
					r1.push(b);
				
					break;
				}
		
		
			case 2:
				{
				
					System.out.println();
					System.out.println(r1.peek());
					System.out.println();
					break;			
				}	
				
				
			case 3:
				{
					System.out.println();
					System.out.println(r1.pop());
					System.out.println();
					break;
				}
				
			case 4:
				{
					System.out.println();
					System.out.println(r1.size);
					System.out.println();	
					break;
				}		

			case 5:
				{
					permit=0;
				}		

			}

		

		}		

		}
		
		else if(choice==2)
		{
			while(permit==1)
		{
		
		System.out.println("1.push");
		System.out.println("2.peek");
		System.out.println("3.pop");
		System.out.println("4.Display size");
		System.out.println("5.exit ot main menu");
		System.out.println();					
		int x=sc.nextInt();

		
		switch(x)
		{
		
			case 1:
				{
				System.out.println();
				int a=sc.nextInt();
					Integer b=a;
					r2.push(b);
				
					break;
				}
		
		
			case 2:
				{
				
					System.out.println();
					System.out.println(r2.peek());
					System.out.println();
					break;			
				}	
				
				
			case 3:
				{
					System.out.println();
					System.out.println(r2.pop());
					System.out.println();
					break;
				}
				
			case 4:
				{
					System.out.println();
					System.out.println(r2.size);
					System.out.println();	
					break;
				}		

			case 5:
				{
					permit=0;
				}		

			}

		

		}		
	
		}
	
		else if(choice==3)
		{
			break loop;

		}

		else 
		{
			System.out.println("Enter a valid choice");
			continue loop;
		}
		



		}

		


	}

}
