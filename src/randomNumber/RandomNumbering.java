package randomNumber;
import java.util.Random;
public class RandomNumbering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Random r = new Random();

				int x = 1 + r.nextInt(10);

				System.out.println( "My random number is " + x );
				
				System.out.println( "Here are some numbers from 1 to 5!" );
				
				// numbers will go from 0 - 4 without 1 +;
				// numbers will go from 3 to 7 with 3 + ;
				// with Random r = new Random(12353), number will not be random anymore;
				
				System.out.print( 3 + r.nextInt(5) + " " );
				System.out.print( 3 + r.nextInt(5) + " " );
				System.out.print( 3 + r.nextInt(5) + " " );
				System.out.print( 3 + r.nextInt(5) + " " );
				System.out.print( 3 + r.nextInt(5) + " " );
				System.out.print( 3 + r.nextInt(5) + " " );
				System.out.println();

				System.out.println( "Here are some numbers from 1 to 100!" );
				System.out.print( 1 + r.nextInt(100) + "\t" );
				System.out.print( 1 + r.nextInt(100) + "\t" );
				System.out.print( 1 + r.nextInt(100) + "\t" );
				System.out.print( 1 + r.nextInt(100) + "\t" );
				System.out.print( 1 + r.nextInt(100) + "\t" );
				System.out.print( 1 + r.nextInt(100) + "\t" );
				System.out.println();

				int num1 = 1 + r.nextInt(10);
				int num2 = 1 + r.nextInt(10);

				if ( num1 == num2 )
				{
					System.out.println( "The random numbers were the same! Weird." );
				}
				if ( num1 != num2 )
				{
					System.out.println( "The random numbers were different! Not too surprising, actually." );
				}
			}
	
	}


