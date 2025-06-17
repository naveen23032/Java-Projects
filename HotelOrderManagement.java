import java.util.Scanner;
class HotelOrderManagement 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		System.out.println("\t\t\t\tWelcome to Hotel");
		System.out.println("1.Buhari \n2.SS Hyderabad \n3.A2B Restaraunt \n4.Amma Canteen");
		int hotel=sc.nextInt();
		switch (hotel){
			case 1:{
				 // Buhari Hotel
                System.out.println("\t\t\t\tWelcome to Buhari Hotel");
                System.out.println("\t\t\t\tSelect your favorite food");
                System.out.println("\t\t\t1. Chicken Biriyani \n\t\t\t2. Mutton Biriyani \n\t\t\t3. Prawn Biriyani \n\t\t\t4. Chicken 65");
                int food = sc.nextInt();
                Thread.sleep(1000);
				switch(food){
					case 1:{
						int price=150;
						processOrder(price);
						break;
						}
					case 2:{
						int price=340;
						processOrder(price);
						break;
						}
					case 3:{
						int price=300;
						processOrder(price);
						break;
						}
					case 4:{
						int price=80;
						processOrder(price);
						break;
						}
						default:{
							System.out.println("Invalid Food Option");
							break;
						}
				}
				break;
				}
			case 2:{
				 // SS Hyderabad
                System.out.println("\t\t\t\tWelcome to SS Hyderabad");
                System.out.println("\t\t\t\tSelect your favorite food");
                System.out.println("\t\t\t1. Hyderabadi Biryani \n\t\t\t2. Mutton Kebab \n\t\t\t3. Chicken Tikka \n\t\t\t4. Haleem");
                int food = sc.nextInt();
                Thread.sleep(1000); // Simulate some delay for user experience

                switch (food) {
                    case 1: {
                        int price = 400;
                        processOrder(price);
                        break;
                    }
                    case 2: {
                        int price = 250;
                        processOrder(price);
                        break;
                    }
                    case 3: {
                        int price = 300;
                        processOrder(price);
                        break;
                    }
                    case 4: {
                        int price = 200;
                        processOrder(price);
                        break;
                    }
                    default: {
                        System.out.println("Invalid food option.");
                        break;
                    }
				}
				break;
			}
			case 3:{
				// A2B Restaurant
                System.out.println("\t\t\t\tWelcome to A2B Restaurant");
                System.out.println("\t\t\t\tSelect your favorite food");
                System.out.println("\t\t\t1. Pongal \n\t\t\t2. Dosa \n\t\t\t3. Idli \n\t\t\t4. Vada");
                int food = sc.nextInt();
                Thread.sleep(1000); // Simulate some delay for user experience

                switch (food) {
                    case 1: {
                        int price = 120;
                        processOrder(price);
                        break;
                    }
                    case 2: {
                        int price = 100;
                        processOrder(price);
                        break;
                    }
                    case 3: {
                        int price = 80;
                        processOrder(price);
                        break;
                    }
                    case 4: {
                        int price = 70;
                        processOrder(price);
                        break;
                    }
                    default: {
                        System.out.println("Invalid food option.");
                        break;
                    }
                }
                break;
            }
			case 4:{
				// Amma Canteen
                System.out.println("\t\t\t\tWelcome to Amma Canteen");
                System.out.println("\t\t\t\tSelect your favorite food");
                System.out.println("\t\t\t1. Rice and Sambar \n\t\t\t2. Chapati with Subzi \n\t\t\t3. Pulao \n\t\t\t4. Paratha with Dal");
                int food = sc.nextInt();
                Thread.sleep(1000); // Simulate some delay for user experience

                switch (food) {
                    case 1: {
                        int price = 50;
                        processOrder(price);
                        break;
                    }
                    case 2: {
                        int price = 60;
                        processOrder(price);
                        break;
                    }
                    case 3: {
                        int price = 70;
                        processOrder(price);
                        break;
                    }
                    case 4: {
                        int price = 80;
                        processOrder(price);
                        break;
                    }
                    default: {
                        System.out.println("Invalid food option.");
                        break;
                    }
                }
                break;
            }
		}
	}
		 public static  void processOrder(int price){
			System.out.print("\t\t\t\t Enter the Quantity:");
			int quantity=sc.nextInt();
			int total=price*quantity;
			showprocessinganimation();
			total=(int)Discount(total);
			System.out.println("\t\t\tTotal Bill for the order is:"+total);
			System.out.println("\t\t\tSelect Payment Type");
			System.out.println("1.Gpay\n2.Phonepay \n3.Paytm");
			int payment=sc.nextInt();
			switch(payment){
				case 1:{
					Handlepayment(total,"Gpay");
					break;
					}
				case 2:{
					Handlepayment(total,"PhonePay");
					break;
					}
				case 3:{
					Handlepayment(total,"Paytm");
					break;
					}
					default:{
						System.out.println("invalid input order cancelled");
						break;
					}
			}
		}
		public static void Handlepayment(int  total,String paymentMethod){
			System.out.println("\t\t\t\tYour payment Method is:"+paymentMethod);
			System.out.println("\t\t\t\tBill Amount is:"+total);
			System.out.print("\t\t\t\tEnter the Amount to Pay:");
			int billamount=sc.nextInt();
			showprocessinganimation();
			if(billamount==total){
				int Otp=(int)(Math.random()*9000)+1000;
				System.out.println("Your OTP is:"+Otp);
				System.out.println("Enter the Otp:");
				int userOtp=sc.nextInt();
				if(Otp==userOtp){
					System.out.println("Your order is Placed Sucessfully");
				    }
				else{
					System.out.println("Incorrect Otp  order is Cancelled");
			        }
			}
			else {
					System.out.println("You Entered Incorrect BillAmount and Order is Cancelled");
				}
		  }
		  // Discount Method Is Applicable Order above 500 
		  public static double Discount(int total){
			if(total>500){
				System.out.println("You are eligible for 10% Discount");
				return total*0.9;
			}
			else{
				return total;
			}
		  }
		  // showprocessingAnimation method
		  public static void showprocessinganimation(){
			Thread processingThread=new Thread(() -> {
				try {
					String message[]={"Processing","Please Wait"};
					int currentmessageindex=0;
					// this for loop is for print  both the message for 3 times
                for (int cycle = 0; cycle <2; cycle++) {
					String currentmessage=message[currentmessageindex];
					// this for loop is for traversing the string in the array string
					
					for(int i=0;i<currentmessage.length();i++)
						{
                    System.out.print(currentmessage.charAt(i));
                    Thread.sleep(200);// Simulating processing
					}
					
					 System.out.print("\r");
					 currentmessageindex++;
                }
                System.out.println("\nProcessing Complete!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
		//start() method is used to begin the execution of a thread
        processingThread.start();
		 try {
        // this join function is one thread waits for the completion of another thread before proceeding another thread
        processingThread.join();
    }   
	    catch (InterruptedException e) {
        e.printStackTrace();
           }
         }
}


