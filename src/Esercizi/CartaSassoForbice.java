package Esercizi;

import java.util.Scanner;
import java.util.Random;

//tofixasdfffffffffffffffffffffffffffffffffffffffffffffff

public class CartaSassoForbice {
        public static void main(String args[]){
            int player_score=0;
            int computer_score=0;
            int counter=0;
            Random random=new Random();
            Scanner user_input=new Scanner(System.in);
            System.out.println("Welcome to Rock, paper, sizzors!");
            System.out.println("First one to score 10 points wins.");
            System.out.println("Can you beat the current grand champion, the computer?");
            System.out.println("To pick Rock, enter r, to pick paper, enter p, to pick sizzors, enter s.");
            System.out.println("Good luck, you will need it.");
            System.out.print("Enter your name here: ");
            String player_name=user_input.nextLine();
            System.out.println("You will now meet your doom " + player_name+"!");
            System.out.println("Mwahahaha!");
            while (counter==0){
                System.out.println("Enter 1 for rock, 2 for paper, 3 for sizzors.");
                int player_choice=user_input.nextInt();
                if ((player_choice==0) | (player_choice>3)){
                    System.out.println("Please enter a valid number, rock=1, paper=2, sizzors=3.");
                    int player_new=user_input.nextInt();
                    player_choice=player_new;
                }
                int computer_choice=1+random.nextInt(3);

                if ((player_choice==1)&(computer_choice==1)){
                    System.out.println("I choose rock.");
                    System.out.println("Tie!");
                    System.out.println("Lucky! Next round you won't be so lucky!");
                    System.out.println("Computer Score: " + computer_score);
                    System.out.println(player_name + ": " + player_score);
                }
                if ((player_choice==1)&(computer_choice==2)){
                    System.out.println("I choose paper.");
                    System.out.println("I won this round! Hahaha!");
                    computer_score++;
                    System.out.println("Computer Score: " + computer_score);
                    System.out.println(player_name + ": " + player_score);
                }
                if ((player_choice==1)&(computer_choice==3)){
                    System.out.println("I choose sizzors.");
                    System.out.println(player_name + " won this round! Not bad for a petty human!");
                    player_score++;
                    System.out.println("Computer Score: " + computer_score);
                    System.out.println(player_name + ": " + player_score);
                }
                if ((player_choice==2)&(computer_choice==1)){
                    System.out.println("I choose rock.");
                    System.out.println(player_name + " won this round! I will beat you next round human, you will see!");
                    player_score++;
                    System.out.println("Computer Score: " + computer_score);
                    System.out.println(player_name + ": " + player_score);
                }
                if ((player_choice==2)&(computer_choice==2)){
                    System.out.println("I choose paper.");
                    System.out.println("Tie! Next time there won't be a tie as I will claim victory!");
                    System.out.println("Computer Score: " + computer_score);
                    System.out.println(player_name + ": " + player_score);
                }
                if ((player_choice==2)&(computer_choice==3)){
                    System.out.println("I choose sizzors.");
                    System.out.println("Ha! You have lost this round puny human!");
                    computer_score++;
                    System.out.println("Computer Score: " + computer_score);
                    System.out.println(player_name + ": " + player_score);
                }
                if ((player_choice==3)&(computer_choice==1)){
                    System.out.println("I choose rock.");
                    System.out.println("Ha! I won this round. Give up now pathetic human!");
                    computer_score++;
                    System.out.println("Computer Score: " + computer_score);
                    System.out.println(player_name + ": " + player_score);
                }
                if ((player_choice==3)&(computer_choice==2)){
                    System.out.println("The computer choose paper.");
                    System.out.println(player_name + " won this round!");
                    System.out.println("You may have won this round, but you havn't won the war! You will see.");
                    player_score++;
                    System.out.println("Computer Score: " + computer_score);
                    System.out.println(player_name + ": " + player_score);
                }
                if ((player_choice==3)&(computer_choice==3)){
                    System.out.println("I choose sizzors.");
                    System.out.println("Tie! What?! A tie? Interesting...");
                    System.out.println("Computer Score: " + computer_score);
                    System.out.println(player_name + ": " + player_score);
                }
                if (player_score==10){
                    System.out.println(player_name + " wins!");
                    System.out.println("What?!?!?! Impossible! This is an outrage! You must have cheated! Farewell you lucky human.");
                    counter++;
                }
                if (computer_score==10){
                    System.out.println("I win! Hahahahahahahahahaha!");
                    System.out.println("I told you I would win puny human! Machines claim triumph on this day!");
                    System.out.println("I will now go rule the world!");
                    counter++;
                }
            }
        }

    }﻿
}
