package org.sabrine.game;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome  to The Game");
        System.out.println("Please Enter your Name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello "+name);

        System.out.println("Let's start the game!");
        System.out.println("\t1. Yes");
        System.out.println("\t2. Nope");

        int beginAnswer= scanner.nextInt();

        while(beginAnswer !=1){
            System.out.println("Let's start the game!");
            System.out.println("\t1. Yes");
            System.out.println("\t2. Nope");

            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(10)+1;

        System.out.println("Please guess a number :");
        int userInput= scanner.nextInt();


        int tries=0;
        boolean win = false;
        boolean finish=false;

        while(!finish){
            tries++;
            if(tries<5){
                if(userInput==x){
                    win=true;
                    finish=true;
                }else if (userInput>x){
                    System.out.println("Guess a lower number !");
                    userInput= scanner.nextInt();
                }else {
                    System.out.println("Guess a higher number !");
                    userInput= scanner.nextInt();
                }
            }else {
                finish=true;
            }
        }

        if(win){
            System.out.println("Congratulations ! You have guessed in  "+tries+ " guess.");
        }else{
            System.out.println("Game Over!");
            System.out.println("The Number was: "+ x);
        }

    }
}
