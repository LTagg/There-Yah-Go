

import java.util.Scanner;

public class Tic {

public static void main(String[] args) {
    char Player='o';
    int row,column;
  
	Scanner funyun =  new Scanner (System.in);
    Game goatcheese = new Game ();
 

    goatcheese.beginGame();
    System.out.println("da game is readyyyyyyyyy !\n");

while(true)
{   
Player=goatcheese.switchPlayer(Player);
System.out.print("\n"+Player +" ,where do you wanna go? (row, column):");
row= funyun.nextInt();
column=funyun.nextInt();

while (goatcheese.checkIfDoable(row,column))
{
System.out.println("That spot is taken (row, column).");
goatcheese.showBoard();
row=funyun.nextInt();
column=funyun.nextInt();
}
goatcheese.changeBoard(Player,row,column );
goatcheese.showBoard();

if(goatcheese.checkIfWon())
{
System.out.println("Yay "+ Player+" won !");
break;

}
if(goatcheese.checkIfTie())
{
    System.out.println("The sgame is a tie! You both suck!");
    break;
}
}
funyun.close();

}

}
