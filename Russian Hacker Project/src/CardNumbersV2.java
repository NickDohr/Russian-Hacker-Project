import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CardNumbersV2
	{
		static long creditCardNumber;
		static Long [] cardDigits = new Long[16];
		static long totalNumber;
		static int validCounter;
		static int invalidCounter;
		
		public static void main(String[] args) throws IOException
			{
				int counter = 0;
				//Scanner myFile = new Scanner(new File("cardList.txt"));
					for(int r = 0; r < 1105; r++){
					  
				for(int c = 15; c >= 0; c--)
				{
					//adding card number into digits
					cardDigits[c] = (long) (Math.random() * 9) + 1;
					
				//	creditCardNumber /= 10;
					
				}
					

					  checkValid();
					  counter++;
					  if(validCounter == 100)
							{
								System.out.println();
								System.out.println("The hackers have successfully generated 100 credit card numbers and it took them " + counter + " tries!");
								System.exit(0);
							}
				 }
				//actual printout 
				System.out.println();
				
				System.out.println("There was " + validCounter + " valid numbers, and " + invalidCounter + " invalid numbers in the list.");
				
			}
		
		public static void checkValid()
		{
			long printCC = creditCardNumber;
			totalNumber = 0;
			
			
			
	//digit stripping and multiplying by two
			for(int a = 0; a < 16; a = a+2)
				{
					
					cardDigits[a] = cardDigits[a]*2;
					if(cardDigits[a] >= 10)
						{
							
							long digit1 = cardDigits[a] % 10;
							long digit2 = cardDigits[a]/10;
							cardDigits[a] = digit1 + digit2;
							
						}
					
				}
			//adding arary numbers up 
			for(int b = 0; b < cardDigits.length; b++)
				{
					totalNumber+=cardDigits[b];
				}
			//checking for actual valid number
		if(totalNumber % 10 == 0)
			{
				for(int c = 0; c < 16; c++)
					{
						System.out.print(cardDigits[c]);
					}
				System.out.print(" is a valid number");
				System.out.println();
				validCounter++;
			}
		else
			{
				for(int c = 0; c < 16; c++)
					{
				System.out.print(cardDigits[c]);
					}
				System.out.print(" is a invalid number");
				System.out.println();
				invalidCounter++;
			}
				
			
			
			
		}
	}
