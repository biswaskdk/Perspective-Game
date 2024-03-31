/*
 * Perception Test themed around Colored SuperHeroes using Wrapper class GUI Interface, While, If-else if-else and switch Statements
 * Bishwash Khakda
 * 11/14/2022
 */

import java.util.*;
import javax.swing.*;
public class PerceptionTest {
    public static void main(String[] args){
        int endGame = 0;
        String authorName = "                                   B.Khadka O.Shrestha";
        String[] introOptions = {"Heroes", "Color", "Both", "Quit"};
        String[] heroes = {"Scorpion", "Lantern", "BenTen", "Sonic", "PowerRanger", "Quit"};
        String[] color = {"Yellow", "Red", "Green", "Blue", "Black", "Quit"};
        String[] rewind = {"Quit", "Attempt Five More Times", "Main Menu"};
        final ImageIcon introScreen = new ImageIcon("psi_cards/introScreen.png");
        
        //Loop to bring back to Main Menu
        while (endGame == 0){
            int heroWin = 0;
            int colorWin = 0;
            int gameCount = 0;
            int perceptionCount = 0;
            //Main Menu Interface
            int userChoiceL1 = JOptionPane.showOptionDialog(null, "<html><h2>Lets Play Perception Game <br> Theme: Colored Heroes</h2>"
                    + " <br>Choose Among Perception Test Type: </html>",
                    "Hero Theme Perception Test" + authorName,
                    0, 0, introScreen, introOptions, introOptions[0]);      
            
            //Options for the Main Menu
            switch (userChoiceL1) {
                
                //Hero Option
                case 0 -> {
                    
                    //Loop For 5 Rounds
                    while (gameCount < 5 ){
                        perceptionCount++;
                        Random randGen = new Random();
                        String colorConstant = color[randGen.nextInt(5)];
                        String computerChoice = heroes[randGen.nextInt(5)];
                        String selectedHeroLocation = "psi_cards/" + computerChoice + colorConstant + ".png";
                        final ImageIcon selectedHero = new ImageIcon(selectedHeroLocation);
                        final ImageIcon heroSelection = new ImageIcon("psi_cards/heroselection.png");
                        String userHeroChoice = heroes[JOptionPane.showOptionDialog(null, "<html><h2>Choose Your Hero</h2></html>",
                                "Round " + perceptionCount + authorName,
                                0, 0, heroSelection, heroes, heroes[2])];
                        String roundMsg = "You choosed " + userHeroChoice + "\n And The Correct choice was " + computerChoice ;
                        
                        //Comparing User and Computer Choices
                        if (userHeroChoice.equals("Quit")){
                            gameCount = 6;
                            endGame = 1;
                            //Back Door
                        }
                        else if ( userHeroChoice.equals(computerChoice)){
                            JOptionPane.showMessageDialog(null, roundMsg + "\n<html><h1>You Win</h1>", "Result" + authorName, 0, selectedHero);
                            heroWin ++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, roundMsg + "\n<html><h1>You Lose</h1>", "Result" + authorName, 0, selectedHero);
                        }
                        
                        gameCount++;
                        
                        //Result after Five rounds gets completed
                        while (gameCount == 5){
                            String finalPerceptionResult = "You took Perception test " + perceptionCount + " times.";
                            String finalHeroResult = "\nYour Total Right Hero Guess is " + heroWin;
                            JOptionPane.showMessageDialog(null, finalPerceptionResult + finalHeroResult, "Final Result" + authorName, 0, introScreen);
                            
                            //Quit, Retry or Return to Main Menu Option Interface
                            int rewindChoice = JOptionPane.showOptionDialog(null, "\n<html><h1>Do you want to Quit, Retry or Return to Main Menu?</h1>",
                                    "Confirmation Screen" + authorName,
                                    0, 0, null, rewind, rewind[0]);
                            switch (rewindChoice) {
                                case 1 -> gameCount = 0;
                                case 2 -> gameCount = 6;
                                default -> {
                                    gameCount = 6;
                                    endGame = 1;
                                }
                            }
                            
                        }
                        
                    }
                    
                }
                
                //Color Option
                case 1 -> {
                    
                    //Loop For 5 Rounds
                    while (gameCount < 5 ){
                        perceptionCount++;
                        Random randGen = new Random();
                        String heroConstant = heroes[randGen.nextInt(5)];
                        String computerChoice = color[randGen.nextInt(5)];
                        String selectedColorLocation = "psi_cards/" + heroConstant + computerChoice + ".png";
                        final ImageIcon selectedColor = new ImageIcon(selectedColorLocation);
                        final ImageIcon colorSelection = new ImageIcon("psi_cards/colorSelection.png");
                        String userColorChoice = color[JOptionPane.showOptionDialog(null, "<html><h2>Choose Your Color</h2></html>",
                                "Round " + perceptionCount + "                                              B.Khadka O.Shrestha",
                                0, 0, colorSelection, color, color[2])];
                        String roundMsg = "You choosed " + userColorChoice + "\n And The Correct choice was " + computerChoice ;
                        
                        //Comparing User and Computer Choices
                        if (userColorChoice.equals("Quit")){
                            gameCount = 6;
                            endGame = 1;
                            //Back Door
                        }
                        else if ( userColorChoice.equals(computerChoice)){
                            JOptionPane.showMessageDialog(null, roundMsg + "\n<html><h1>You Win</h1>", "Result" + authorName, 0, selectedColor);
                            colorWin ++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, roundMsg + "\n<html><h1>You Lose</h1>", "Result" + authorName, 0, selectedColor);
                        }
                        
                        gameCount++;
                        
                        //Result after Five rounds gets completed
                        while (gameCount == 5){
                            String finalPerceptionResult = "You took Perception test " + perceptionCount + " times.";
                            String finalHeroResult = "\nYour Total Right Color Guess is " + colorWin;
                            JOptionPane.showMessageDialog(null, finalPerceptionResult + finalHeroResult, "Final Result" + authorName, 0, introScreen);
                            
                            //Quit, Retry or Return to Main Menu Option Interface
                            int rewindChoice = JOptionPane.showOptionDialog(null, "\n<html><h1>Do you want to Quit, Retry or Return to Main Menu?</h1>",
                                    "Confirmation Screen" + authorName,
                                    0, 0, null, rewind, rewind[0]);
                            switch (rewindChoice) {
                                case 1 -> gameCount = 0;
                                case 2 -> gameCount = 6;
                                default -> {
                                    gameCount = 6;
                                    endGame = 1;
                                }
                            }
                            
                        }
                        
                    }
                    
                }
                
                //Both Hero and Color Option
                case 2 -> {
                    
                    //Loop For 5 Rounds
                    while (gameCount < 5 ){
                        perceptionCount++;
                        Random randGen = new Random();
                        String promptOne = "";
                        String promptTwo = "";
                        String computerHeroChoice = heroes[randGen.nextInt(5)];
                        String computerColorChoice = color[randGen.nextInt(5)];
                        String selectedHeroLocation = "psi_cards/" + computerHeroChoice + computerColorChoice + ".png";
                        final ImageIcon selectedHero = new ImageIcon(selectedHeroLocation);
                        final ImageIcon heroSelection = new ImageIcon("psi_cards/heroSelection.png");
                        final ImageIcon colorSelection = new ImageIcon("psi_cards/colorSelection.png");
                        String userHeroChoice = heroes[JOptionPane.showOptionDialog(null, "<html><h2>Choose Your Hero</h2></html>",
                                "Round " + perceptionCount + authorName,
                                0, 0, heroSelection, heroes, heroes[2])];
                        
                        //Comparing User and Computer Hero Choices
                        if (userHeroChoice.equals("Quit")){
                            gameCount = 6;
                            endGame = 1;
                            //Back Door
                        }
                        else if ( userHeroChoice.equals(computerHeroChoice)){
                            heroWin ++;
                            promptOne = "\n<html><h2>You choosed the Right Hero</h2></html>";
                        }
                        else {
                            promptOne = "\n<html><h2>You choosed the Wrong Hero</h2></html>";
                        }
                        
                        //Back Door for Hero Option
                        if (!userHeroChoice.equals("Quit")){
                            String userColorChoice = color[JOptionPane.showOptionDialog(null, "<html><h2>Choose Your Color</h2></html>",
                                    "Round " + perceptionCount + authorName,
                                    0, 0, colorSelection, color, color[2])];
                        
                            //Comparing User and Computer Color Choices
                            if (userColorChoice.equals("Quit")){
                                gameCount = 6;
                                endGame = 1;
                                //Back Door
                            }
                            else if ( userColorChoice.equals(computerColorChoice)){
                                colorWin ++;
                                promptTwo = "\n<html><h2>You choosed the Right Color</h2></html>";
                            }
                            else {
                                promptTwo = "\n<html><h2>You choosed the Wrong Color</h2></html>";
                            }
                            
                            //Back Door for Color Option
                            if (!userColorChoice.equals("Quit")){
                                String roundMsgHero = "You choosed " + userHeroChoice + "\n And The Correct choice was " + computerHeroChoice + promptOne ;
                                String roundMsgColor = "\nYou choosed " + userColorChoice + "\n And The Correct choice was " + computerColorChoice + promptTwo ;
                                JOptionPane.showMessageDialog(null, roundMsgHero + roundMsgColor, "Result" + authorName, 0, selectedHero);
                                gameCount++;
                            }
                        }    
                        
                        //Result after Five rounds gets completed
                        while (gameCount == 5){
                            String finalPerceptionResult = "You took Perception test " + perceptionCount + " times.";
                            String finalHeroResult = "\nYour Total Right Hero Guess is " + heroWin;
                            String finalColorWin = "\nYour Total Right Color Guess is " + colorWin;
                            JOptionPane.showMessageDialog(null, finalPerceptionResult + finalHeroResult + finalColorWin, "Final Result" + authorName, 0, introScreen);
                                
                            //Quit, Retry or Return to Main Menu Option Interface
                            int rewindChoice = JOptionPane.showOptionDialog(null, "\n<html><h1>Do you want to Quit, Retry or Return to Main Menu?</h1>",
                                        "Confirmation Screen" + authorName,
                                        0, 0, null, rewind, rewind[0]);
                            switch (rewindChoice) {
                                case 1 -> gameCount = 0;
                                case 2 -> gameCount = 6;
                                default -> {
                                    gameCount = 6;
                                    endGame = 1;
                                }
                            }
                        
                        }
                        
                    }
                    
                }
                
                //Back Door
                default -> {
                    endGame = 1;
                }
                
            }//Closing Options for the Main Menu
        }//Loop to bring back to Main Menu
        JOptionPane.showMessageDialog(null, "The Game is TERMINATED!!!", "ENDGAME" + authorName, 0, introScreen);//Termination Screen
    }
}
