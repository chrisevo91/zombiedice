/*christopher eviston 2894321 
This is an assigment to build a zombie dice game */

import java.util.*;

class zombiedice{
	public static void main(String[] args){
	
		Scanner in= new Scanner (System.in); // Scanner 
		Random r = new Random(); // Random number generator


		int green[] = {1,2,3,4,5,6};
		int yellow[] = {1,2,3,4,5,6};
		int red[] = {1,2,3,4,5,6};
		int select;
		int player1 = 0;
		int player2 = 0;
		int throw1 = 0;
		int throw2 = 0;
		int throw3 = 0;
		int dice1 = 0;
		int dice2 = 0;
		int dice3 = 0;
		int exit = 1;
		int brains = 0;
		int shotgun = 0;
		int footsteps = 0;
		int numOfplayers = 2;
		
		 System.out.println("\n\n\n\n\n\n\n\n\n\n");
		 System.out.println("------------------------------------");
		 System.out.println("-------WELCOME TO ZOMBIE DICE!!!!!!------"); //welcomes user to game
		 System.out.println("------------------------------------");
		 System.out.println("");
		 System.out.println("");

		 do{  //beginning of do while loop

		 	//main menu
		 	 System.out.println("");
		 	 System.out.println("current number of players = " + numOfplayers); // feature for user to display current number of players 
		 	 System.out.println("\n\n");
			 System.out.println("1.Choose number of players"); 
			 System.out.println("2.Play game"); 
			 System.out.println("3.Exit game");
			 System.out.println("\n\n\n\n");
			

			 select = in.nextInt();  // reads in what the user selects

			 if (select == 1 ){
			 	System.out.println("\n\n\n\n\n\n\n\n");
			 	System.out.println("-----------------------");
			 	System.out.println("How many players would you like?"); // prompt user to select number of players
			 	numOfplayers = in.nextInt(); // reads in users input for number of players
			 	System.out.println("-----------------------");
			 	System.out.println("\n\n\n");
			 	
			}

			else if (select == 2){ // if select is = 2 then the dice will be rolled
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("---------------------------");
				System.out.println("~ You Have rolled the dice ~"); 
				System.out.println("---------------------------");
				System.out.println("");
				dice1 = r.nextInt(3)+1; // this is the first die that will generate a number beteween 1 and 3
				dice2 = r.nextInt(3)+1; // this is the second die that will generate a number beteween 1 and 3
				dice3 = r.nextInt(3)+1; // this is the third die that will generate a number beteween 1 and 3
				System.out.println("");
			}

                   /*--------------------------------------------------------------------------------------------------------------------------------------*/


				if(dice1==1){ // if dice1 lands on 1 
					System.out.println("");
					System.out.println("[green]"); // user gets the green die
					throw1 = r.nextInt(6) + 1;   // throw1 will generate a number between 1 and 6
					if(throw1 < green[3]){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains
						

					}

					else if(throw1 == green[3] || throw1 == green[4]){ // if throw1 lands on position 3 or 4 in the array
						footsteps++; // footsteps is incremented
						System.out.println("Footsteps"); // user gets footsteps
					}
						

					else if(throw1 == green[5]){ // if throw1 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						 
					}
				}

				

                  /*--------------------------------------------------------------------------------------------------------------------------------------*/

				else if(dice1==2){ // if dice1 lands on 2
					System.out.println("");
					System.out.println("[yellow]"); // user gets yellow die
					throw1 = r.nextInt(6) + 1; // throw1 will generate a number between 1 and 6
					if(throw1 < green[2]){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
						
				    }

					else if(throw1 == green[2] || throw1 == green[3]){ // if throw1 lands on position 2 or 3 in the array
						footsteps++; // footsteps is incremented
						System.out.println("Footsteps");  // user gets footsteps
					}
						

					else if(throw1 == green[4] || throw1 == green[5]){ // if throw1 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					}
				}

                  /*--------------------------------------------------------------------------------------------------------------------------------------*/

				else if(dice1==3){ // if dice1 lands on 3
					System.out.println("");
					System.out.println("[red]"); // user gets red die
					if(throw1 < green[3]){ // if throw1 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					}

					else if(throw1 == green[3] || throw1 == green[4]){ // if throw1 lands on position 3 or 4 in the array
						footsteps++; // footsteps is incremented
						System.out.println("Footsteps"); // user gets footsteps
					}

					else if(throw1 == green[5]){ // if throw1 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
				}
				

                  /*--------------------------------------------------------------------------------------------------------------------------------------*/

			    if(dice2==1){ // if dice2 lands on 1
			    	System.out.println("");
					System.out.println("[green]"); // user gets the green die
					throw2 = r.nextInt(6) + 1;   // throw2 will generate a number between 1 and 6
					if(throw2 < green[3]){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains
						
					}
				

					else if(throw2 == green[3] || throw2 == green[4]){ // if throw2 lands on position 3 or 4 in the array
						footsteps++; // footsteps is incremented
						System.out.println("Footsteps"); // user gets footsteps
						
					}

					else if(throw2 == green[5]){ // if throw2 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					}
				}


				

                 /*--------------------------------------------------------------------------------------------------------------------------------------*/

				else if(dice2==2){ // if dice2 lands on 2
					System.out.println("");
					System.out.println("[yellow]"); // user gets yellow die
					throw2 = r.nextInt(6) + 1; // throw2 will generate a number between 1 and 6
					if(throw2 < green[2]){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
						
					}
				

					else if(throw2 == green[2] || throw2 == green[3]){ // if throw2 lands on position 2 or 3 in the array
						footsteps++; // footsteps is incremented
						System.out.println("Footsteps");  // user gets footsteps
						
					}

					else if(throw2 == green[4] || throw2 == green[5]){ // if throw2 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					
					}
				}

                  /*--------------------------------------------------------------------------------------------------------------------------------------*/

				else if(dice2==3){ // if dice2 lands on 3
					System.out.println("");
					System.out.println("[red]"); // user gets red die
					if(throw2 < green[3]){ // if throw2 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					}
				

					else if(throw2 == green[3] || throw2 == green[4]){ // if throw2 lands on position 3 or 4 in the array
						footsteps++; // footsteps is incremented
						System.out.println("Footsteps"); // user gets footsteps
						
					}

					else if(throw2 == green[5]){ // if throw2 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
						
					}
				}

				

                  /*--------------------------------------------------------------------------------------------------------------------------------------*/

			    if(dice3==1){ // if dice 3  lands on 1
			    	System.out.println("");
					System.out.println("[green]"); // user gets the green die
					throw1 = r.nextInt(6) + 1;   // throw1 will generate a number between 1 and 6
					if(throw1 < green[3]){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains
						
					}
				

					else if(throw1 == green[3] || throw1 == green[4]){ // if throw1 lands on position 3 or 4 in the array
						footsteps++; // footsteps is incremented
						System.out.println("Footsteps"); // user gets footsteps
						
					}

					else if(throw1 == green[5]){ // if throw1 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					}
				}
					
				

                 /*--------------------------------------------------------------------------------------------------------------------------------------*/

				else if(dice3==2){ // if dice3 lands on 2
					System.out.println("");
					System.out.println("[yellow]"); // user gets yellow die
					throw1 = r.nextInt(6) + 1; // throw1 will generate a number between 1 and 6
					if(throw1 < green[2]){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
						
					}
				

					else if(throw1 == green[2] || throw1 == green[3]){ // if throw1 lands on position 2 or 3 in the array
						footsteps++; // footsteps is incremented
						System.out.println("Footsteps");  // user gets footsteps
						
					}

					else if(throw1 == green[4] || throw1 == green[5]){ // if throw1 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					}
				}

				
 
                 /*--------------------------------------------------------------------------------------------------------------------------------------*/

				else if(dice3==3){ // if dice3 lands on 3
					System.out.println(" ");
					System.out.println("[red]"); // user gets red die
					if(throw1 < green[3]){ // if throw1 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					}
				

					else if(throw1 == green[3] || throw1 == green[4]){ // if throw1 lands on position 3 or 4 in the array
						footsteps++; // footsteps is incremented
						System.out.println("Footsteps"); // user gets footsteps
						
					}

					else if(throw1 == green[5]){ // if throw1 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
						System.out.println(brains);
					}
				}

				else if(brains == 13){
					System.out.println("GAME OVER");
					System.out.println("Brains =" + brains);
					System.out.println("Shotgun = " + shotgun);
					break;
				}


			else if (select == 3){ //if user selects 3 the game will end
				break; //variable to exit program
			}

			else{
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("-------------------------------");
				System.out.println("Invalid Selection----Try again"); //if user enters a number that is not an option in main menu they will be prompted to try again
				System.out.println("-------------------------------");
				System.out.println("");
			}	
		}

	

		while(exit!=0);     // As long as exit is not = 0 the game will keep running, otherwise the game will end
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("----------------------");
		System.out.println("Player 1 score = " + player1);  
		System.out.println("----------------------");
		System.out.println("\n\n\n");
		System.out.println("----------------------");
		System.out.println("player 2  = " + player2 ); 
		System.out.println("----------------------");
		System.out.println("\n\n\n");
		System.out.println("----------------------");
		System.out.println("Thanks for playing!!!");
		System.out.println("----------------------");
		System.out.println("\n\n");
	}//end main()

}//end zombiedice game
