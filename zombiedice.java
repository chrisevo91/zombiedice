/*christopher eviston 2894321 
This is an assigment to build a zombie dice game */

import java.util.*;

class zombiedice{
	public static void main(String[] args){
	
		Scanner in= new Scanner (System.in); // Scanner 
		Random r = new Random(); // Random number generator

		int game = 0;
		int green[] = {1,2,3,4,5,6};
		int yellow[] = {1,2,3,4,5,6};
		int red[] = {1,2,3,4,5,6};
		int select;
		int select2;
		int player = 0;
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
		int brains1 = 0;
		int brains2 = 0;
		int brains3 = 0;
		int shotgun = 0;
		int numOfplayers = 2;
		String name1 = "";
		String name2 = "";
		String name3 = "";
		
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
		 	 System.out.println("\n");
		 	 System.out.println(" ____________________________");
			 System.out.println("| 1.Choose number of players |"); 
			 System.out.println("| 2.Play game                |");
			 System.out.println("| 3.Cash out                 |"); 
			 System.out.println(" ____________________________");
			 System.out.println("\n");
			

			 select = in.nextInt();  // reads in what the user selects

			 if (select == 1 ){
			 	System.out.println("\n");
			 	System.out.println("-----------------------");
			 	System.out.println("How many players would you like?"); // prompt user to select number of players
			 	numOfplayers = in.nextInt(); // reads in users input for number of players
			 	System.out.println("-----------------------");
			 	System.out.println("\n");
			 	
			}

			else if (select == 2){ // if select is = 2 then the dice will be rolled
				System.out.println("Player 1 please enter your name");
				in.nextLine();
				name1 = in.nextLine();
				System.out.println("");

				System.out.println("Player 2 please enter your name");
				name2 = in.nextLine();
				System.out.println("");
				

				if(numOfplayers==3){
					System.out.println("Player 3 please enter your name");
					name3 = in.nextLine();
					System.out.println("\n\n\n\n");
					
					}

				player=1; // current player

	 /*--------------------------------------------------------start of game -------------------------------------------------------*/

           
            	while(game==0){

            		
           
            		if(player>numOfplayers){
            			player=1;
            		}

     /*--------------------------------------------------------start of dice -------------------------------------------------------*/
     			
     			if(player==1){
     				System.out.println(name1 + "'s turn");
     			}
     			else if(player==2){
     				System.out.println(name2 + "'s turn");
     			}
     			else if(player==3){
     				System.out.println(name3 + "'s turn");
     			}
     			
				System.out.println("---------------------------");
				System.out.println("~ You Have rolled the dice ~"); 
				System.out.println("---------------------------");

				brains=0;
				
				dice1 = r.nextInt(3)+1; // this is the first die that will generate a number beteween 1 and 3
				dice2 = r.nextInt(3)+1; // this is the second die that will generate a number beteween 1 and 3
				dice3 = r.nextInt(3)+1; // this is the third die that will generate a number beteween 1 and 3

				if(dice1==1){ // if dice1 lands on 1 
					System.out.println("");
					System.out.println("[green]"); // user gets the green die
					throw1 = r.nextInt(6) + 1;   // throw1 will generate a number between 1 and 6
					if(throw1 <= green[2] && player==1){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					else if(throw1 == green[3] && player==1 || throw1 == green[4] && player==1){ // if throw1 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}
						
					else if(throw1 == green[5] && player==1){ // if throw1 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					if(throw1 <= green[2] && player==2){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
					else if(throw1 == green[3] && player==2 || throw1 == green[4] && player==2){ // if throw1 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}	
					else if(throw1 == green[5] && player==2){ // if throw1 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					if(throw1 <= green[2] && player==3){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
					else if(throw1 == green[3] && player==3 || throw1 == green[4] && player==3){ // if throw1 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}	
					else if(throw1 == green[5] && player==3){ // if throw1 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}
				}
                  

				else if(dice1==2){ // if dice1 lands on 2
					System.out.println("");
					System.out.println("[yellow]"); // user gets yellow die
					throw1 = r.nextInt(6) + 1; // throw1 will generate a number between 1 and 6
					if(throw1 <= yellow[1] && player==1){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
				    }
					else if(throw1 == yellow[2] && player==1 || throw1 == yellow[3] && player==1){ // if throw1 lands on position 2 or 3 in the array
						System.out.println("Footsteps");  // user gets footsteps
					}
					else if(throw1 == yellow[4] && player==1 || throw1 == yellow[5] && player==1){ // if throw1 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					if(throw1 <= yellow[1] && player==2){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
				    }
					else if(throw1 == yellow[2] && player==2 || throw1 == yellow[3] && player==2){ // if throw1 lands on position 2 or 3 in the array
						System.out.println("Footsteps");  // user gets footsteps
					}	
					else if(throw1 == yellow[4] && player==2 || throw1 == yellow[5] && player==2){ // if throw1 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					if(throw1 <= yellow[1] && player==3){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
				    }
					else if(throw1 == yellow[2] && player==3 || throw1 == yellow[3] && player==3){ // if throw1 lands on position 2 or 3 in the array
						System.out.println("Footsteps");  // user gets footsteps
					}
						
					else if(throw1 == yellow[4] && player==3 || throw1 == yellow[5] && player==3){ // if throw1 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}
				}
                  

				else if(dice1==3){ // if dice1 lands on 3
					System.out.println("");
					System.out.println("[red]"); // user gets red die
					if(throw1 <= red[2] && player==1){ // if throw1 is less than position 2
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					else if(throw1 == red[3] && player==1 || throw1 == red[4] && player==1){ // if throw1 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}

					else if(throw1 == red[5] && player==1){ // if throw1 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					if(throw1 <= red[2] && player==2){ // if throw1 is less than position 2
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					else if(throw1 == red[3] && player==2 || throw1 == red[4] && player==2){ // if throw1 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}

					else if(throw1 == red[5] && player==2){ // if throw1 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					if(throw1 <= red[2] && player==3){ // if throw1 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					else if(throw1 == red[3] && player==3 || throw1 == red[4] && player==3){ // if throw1 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}

					else if(throw1 == red[5] && player==3){ // if throw1 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
				}

	/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	/*--------------------------------------------------------------END OF DICE1 CODE--------------------------------------------------------------*/
	/*---------------------------------------------------------------------------------------------------------------------------------------------*/
                  

			    if(dice2==1){ // if dice2 lands on 1
			    	System.out.println("");
					System.out.println("[green]"); // user gets the green die
					throw2 = r.nextInt(6) + 1;   // throw2 will generate a number between 1 and 6
					if(throw2 <= green[2] && player==1){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					else if(throw2 == green[3] && player==1 || throw2 == green[4] && player==1){ // if throw2 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}

					else if(throw2 == green[5] && player==1){ // if throw2 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						in.nextLine();
					}

					if(throw2 <= green[2] && player==2){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					else if(throw2 == green[3] && player==2 || throw2 == green[4] && player==2){ // if throw2 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}

					else if(throw2 == green[5] && player==2){ // if throw2 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					if(throw2 <= green[2] && player==3){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					else if(throw2 == green[3] && player==3 || throw2 == green[4] && player==3){ // if throw2 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}

					else if(throw2 == green[5] && player==3){ // if throw2 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}
				}
                 

				else if(dice2==2){ // if dice2 lands on 2
					System.out.println("");
					System.out.println("[yellow]"); // user gets yellow die
					throw2 = r.nextInt(6) + 1; // throw2 will generate a number between 1 and 6
					if(throw2 <= yellow[1] && player==1){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
					else if(throw2 == yellow[2] && player==1 || throw2 == yellow[3] && player==1){ // if throw2 lands on position 2 or 3 in the array
						System.out.println("Footsteps");  // user gets footsteps
					}
					else if(throw2 == yellow[4] && player==1 || throw2 == yellow[5] && player==1){ // if throw2 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					if(throw2 <= yellow[1] && player==2){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
					else if(throw2 == yellow[2] && player==2 || throw2 == yellow[3] && player==2){ // if throw2 lands on position 2 or 3 in the array
						System.out.println("Footsteps");  // user gets footsteps
					}
					else if(throw2 == yellow[4] && player==2 || throw2 == yellow[5] && player==2){ // if throw2 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					if(throw2 <= yellow[1] && player==3){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
					else if(throw2 == yellow[2] && player==3 || throw2 == yellow[3] && player==3){ // if throw2 lands on position 2 or 3 in the array
						System.out.println("Footsteps");  // user gets footsteps
					}
					else if(throw2 == yellow[4] && player==3 || throw2 == yellow[5] && player==3){ // if throw2 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}
				}

                  

				else if(dice2==3){ // if dice2 lands on 3
					System.out.println("");
					System.out.println("[red]"); // user gets red die
					if(throw2 <= red[2] && player==1){ // if throw2 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}
					else if(throw2 == red[3] && player==1 || throw2 == red[4]  && player==1){ // if throw2 lands on position 3 or 4 in the array
						System.out.println("Footsteps"); // user gets footsteps
					}
					else if(throw2 == red[5]  && player==1){ // if throw2 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					if(throw2 <= red[2] && player==2){ // if throw2 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}
					else if(throw2 == red[3] && player==2 || throw2 == red[4]  && player==2){ // if throw2 lands on position 3 or 4 in the array
						
						System.out.println("Footsteps"); // user gets footsteps
					}
					else if(throw2 == red[5]  && player==2){ // if throw2 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					if(throw2 <= red[2] && player==3){ // if throw2 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}
					else if(throw2 == red[3] && player==3 || throw2 == red[4]  && player==3){ // if throw2 lands on position 3 or 4 in the array
						
						System.out.println("Footsteps"); // user gets footsteps
					}
					else if(throw2 == red[5]  && player==3){ // if throw2 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
				}

	/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	/*--------------------------------------------------------------END OF DICE2 CODE--------------------------------------------------------------*/
	/*---------------------------------------------------------------------------------------------------------------------------------------------*/
                  

			    if(dice3==1){ // if dice 3  lands on 1
			    	System.out.println("");
					System.out.println("[green]"); // user gets the green die
					throw3 = r.nextInt(6) + 1;   // throw1 will generate a number between 1 and 6
					if(throw1 <= green[2] && player==1){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains	
					}
					else if(throw3 == green[3] && player==1 || throw1 == green[4] && player==1){ // if throw1 lands on position 3 or 4 in the array
						
						System.out.println("Footsteps"); // user gets footsteps
					}
					else if(throw3 == green[5] && player==1){ // if throw1 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					if(throw3 <= green[2] && player==2){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains	
					}
					else if(throw3 == green[3] && player==2 || throw3 == green[4] && player==2){ // if throw1 lands on position 3 or 4 in the array
						
						System.out.println("Footsteps"); // user gets footsteps
					}
					else if(throw3 == green[5] && player==2){ // if throw1 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}

					if(throw3 <= green[2] && player==3){  // if that number is less than position 3 in the array
						brains++;  // brains in incremented
						System.out.println("Brains"); // user gets brains	
					}
					else if(throw3 == green[3] && player==3 || throw3 == green[4] && player==3){ // if throw1 lands on position 3 or 4 in the array
						
						System.out.println("Footsteps"); // user gets footsteps
					}

					else if(throw3 == green[5] && player==3){ // if throw1 is at position 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}
				}
                 

				else if(dice3==2){ // if dice3 lands on 2
					System.out.println("");
					System.out.println("[yellow]"); // user gets yellow die
					throw1 = r.nextInt(6) + 1; // throw1 will generate a number between 1 and 6
					if(throw3 <= yellow[1] && player==1){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
						
					}
					else if(throw3 == yellow[2] && player==1 || throw3 == yellow[3] && player==1){ // if throw1 lands on position 2 or 3 in the array
						
						System.out.println("Footsteps");  // user gets footsteps
					}
					else if(throw3 == yellow[4] && player==1 || throw3 == yellow[5] && player==1){ // if throw1 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun	
					}

					if(throw3 <= yellow[1] && player==2){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
					else if(throw3 == yellow[2] && player==2 || throw3 == yellow[3] && player==2){ // if throw1 lands on position 2 or 3 in the array
						
						System.out.println("Footsteps");  // user gets footsteps
					}
					else if(throw3 == yellow[4] && player==2 || throw3 == yellow[5] && player==2){ // if throw1 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun	
					}

					if(throw3 <= yellow[1] && player==3){ // if that number is less than position 1 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
					else if(throw3 == yellow[2] && player==3 || throw3 == yellow[3] && player==3){ // if throw1 lands on position 2 or 3 in the array
						
						System.out.println("Footsteps");  // user gets footsteps
						
					}
					else if(throw3 == yellow[4] && player==3 || throw3 == yellow[5] && player==3){ // if throw1 lands on position 4 or 5 in the array
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun	
					}
				}
                 
				else if(dice3==3){ // if dice3 lands on 3
					System.out.println(" ");
					System.out.println("[red]"); // user gets red die
					if(throw3 <= red[2] && player==1){ // if throw1 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					}
					else if(throw3 == red[3] && player==1 || throw3 == red[4] && player==1){ // if throw1 lands on position 3 or 4 in the array
						
						System.out.println("Footsteps"); // user gets footsteps
					}
					else if(throw3 == red[5] && player==1){ // if throw1 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					if(throw3 <= red[2] && player==2){ // if throw1 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
					}
					else if(throw3 == red[3] && player==2 || throw3 == red[4] && player==2){ // if throw1 lands on position 3 or 4 in the array
						
						System.out.println("Footsteps"); // user gets footsteps
					}
					else if(throw3 == red[5] && player==2){ // if throw1 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}

					if(throw3 <= red[2] && player==3){ // if throw1 is less than position 3
						shotgun++; // shotgun is incremented
						System.out.println("Shotgun"); // user gets shotgun
						
					}
					else if(throw3 ==red[3] && player==3 || throw3 == red[4] && player==3){ // if throw1 lands on position 3 or 4 in the array
						
						System.out.println("Footsteps"); // user gets footsteps
					}
					else if(throw3 == red[5] && player==3){ // if throw1 lands on postion 5 in the array
						brains++; // brains in incremented
						System.out.println("Brains"); // user gets brains
					}
				}

		    /*----------------------------------------------------------end of dice -------------------------------------------------------*/

			if(brains1>=13 && player==1 || brains2>=13 && player==2 || brains3>= 13 && player==3){
				
				exit=0;	
			}
			else if(player==1 && shotgun>=3 || player==2 && shotgun>=3 || player==3 && shotgun>=3){
				System.out.println("\n");
				System.out.println("BOOM there goes your head!!!!");
				brains=0; // brains is = 0 at start of each turn
				player++;
				shotgun=0;
			}
			else{
			System.out.println("\n");
			System.out.println("Do you want to roll again??? or would you rather cash out???");
			select2 = in.nextInt();
				if(select2==2 && player==1){
					System.out.println(""); 
					System.out.println("Player 1 cashed out, score = " + brains1);
					brains1 = brains1 + brains;
					player++;
					//brains=0; // brains is = 0 at start of each turn
				}
				else if(select2==2 && player==2){
					System.out.println(""); 
					System.out.println("Player 2 cashed out, score " + brains2 );
					brains2 = brains2 + brains;
					player++;
					//brains=0; // brains is = 0 at start of each turn
				}
				else if(select2==2 && player==3){
					System.out.println(""); 
					System.out.println("Player 3 cashed out, score " + brains3);
					brains3 = brains3 + brains;
					player++;
					//brains=0; // brains is = 0 at start of each turn
				}
			}
			/*-------------------------------end of loop-----------------------------*/
			}
		}
			
		}

		while(exit!=1);   // As long as exit is not = 0 the game will keep running, otherwise the game will end
		       

			if(brains1>=13 || brains2>=13 || brains3 >= 13){
				System.out.println("Congratulations " + player-- + " you win!!!!");
				System.out.println("\n");
				System.out.println("----------------------");
				System.out.println("score = " + brains);  
				System.out.println("----------------------");
				System.out.println("\n");
				System.out.println("Thanks for playing!!!");
				System.out.println("----------------------");
				System.out.println("\n");
			}
			else if(shotgun==3){
				System.out.println("\n");
				System.out.println("you have been shot 3 times, you lose your brains");
				System.out.println("shotgun = " + shotgun);
			}
		
	}//end main()

}//end zombiedice game
