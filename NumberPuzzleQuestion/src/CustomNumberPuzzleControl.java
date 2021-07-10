import java.awt.*;
import java.util.*;
class CustomNumberPuzzleControl extends NumberPuzzleControl {
	public int getWidth() {
		return 200;
	}
	public int getHeight() {
		return 250;
	}
	public int getXPosition() {
		return 200;
	}
	public int getYPosition() {
		return 200;
	}
	public String getTitle(){
		return "Number Puzzle";
	}
	public int getShuffleButtonFontSize() {
		return 12;
	}
	public int getNumbersFontSize() {
		return 12;
	}
	public Color getEmptyButtonColor() {
		return Color.WHITE;
	}
	public String getWinnerMessage() {
		return "Congrats, you have won!";
	}



	public int handleButtonClicked(NumberPuzzleGame game){
		int emptyCellId = game.getEmptyCellId();
		Button buttonClicked = game.getButtonClicked();
		Button[] buttons = game.getButtons();
	    //Checking each cases using switch and perform swapping if conditions are met
		switch(emptyCellId) {
		case 0:if(buttonClicked == buttons[emptyCellId + 1]) { //When emptycell is at 0 index, it can swap with right and down position 
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId + 1;
			break;
		}
		if(buttonClicked == buttons[emptyCellId + 4]) { //Down position checking
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId + 4;
			break;
		}
		case 1:                                       //When emptycell is at  1st or 2nd  index, it can swap with right,left  and down position
		case 2:if(buttonClicked == buttons[emptyCellId + 1]) {
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId + 1;
			break;
		}if(buttonClicked == buttons[emptyCellId - 1]) {
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId - 1;
			break;
		}if(buttonClicked == buttons[emptyCellId + 4]) {
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId + 4;
			break;
		}
		
		case 3:if(buttonClicked == buttons[emptyCellId - 1]) {//When emptycell is at 3rd  index, it can swap with down or left position
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId - 1;
			break;
		}if(buttonClicked == buttons[emptyCellId + 4]) {
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId + 4;
			break;
		}
		case 4:                                                //When emptycell is at 4th and 8th  index, it can swap with right,up and down position
		case 8:if(buttonClicked == buttons[emptyCellId + 1]) {
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId + 1;
			break;}
			if(buttonClicked == buttons[emptyCellId + 4]) {
				swapButton(buttons[emptyCellId],buttonClicked);
				emptyCellId = emptyCellId + 4;
				break;
			}
			if(buttonClicked == buttons[emptyCellId - 1]) {
				swapButton(buttons[emptyCellId],buttonClicked);
				emptyCellId = emptyCellId - 1;
				break;}
		case 5:                                             //When emptycell is at 5th,6th,9th and 10th  index, it can swap with left,right,up and down position
		case 6:
		case 9:
		case 10:if(buttonClicked == buttons[emptyCellId + 1]) {
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId + 1;
			break;}
			if(buttonClicked == buttons[emptyCellId + 4]) {
				swapButton(buttons[emptyCellId],buttonClicked);
				emptyCellId = emptyCellId + 4;
				break;
			}
			if(buttonClicked == buttons[emptyCellId - 1]) {
				swapButton(buttons[emptyCellId],buttonClicked);
				emptyCellId = emptyCellId - 1;
				break;}
			if(buttonClicked == buttons[emptyCellId - 4]) {
					swapButton(buttons[emptyCellId],buttonClicked);
					emptyCellId = emptyCellId - 4;
					break;
				}
		
		case 7:                                                  //When emptycell is at 7th and 11th  index, it can swap with left,up and down position
		case 11:
			if(buttonClicked == buttons[emptyCellId + 4]) {
				swapButton(buttons[emptyCellId],buttonClicked);
				emptyCellId = emptyCellId + 4;
				break;
			}
			if(buttonClicked == buttons[emptyCellId - 1]) {
				swapButton(buttons[emptyCellId],buttonClicked);
				emptyCellId = emptyCellId - 1;
				break;}
			if(buttonClicked == buttons[emptyCellId - 4]) {
					swapButton(buttons[emptyCellId],buttonClicked);
					emptyCellId = emptyCellId - 4;
					break;
				}
		
		
		
		
		case 12:if(buttonClicked == buttons[emptyCellId + 1]) {  //When emptycell is at 12th  index, it can swap with up and right position
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId + 1;
			break;
		}
			
			if(buttonClicked == buttons[emptyCellId - 4]) {
					swapButton(buttons[emptyCellId],buttonClicked);
					emptyCellId = emptyCellId - 4;
					break;
				}
		case 13:                                                //When emptycell is at 13th and 14th  index, it can swap with left,up and right position
		case 14:if(buttonClicked == buttons[emptyCellId + 1]) {
			swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = emptyCellId + 1;
			break;}
			if(buttonClicked == buttons[emptyCellId - 1]) {
				swapButton(buttons[emptyCellId],buttonClicked);
				emptyCellId = emptyCellId - 1;
				break;}
			if(buttonClicked == buttons[emptyCellId - 4]) {
				swapButton(buttons[emptyCellId],buttonClicked);
				emptyCellId = emptyCellId - 4;
				break;}
		case 15:                                        //When emptycell is at 15th  index, it can swap with left and up  position
			
			if(buttonClicked == buttons[emptyCellId - 1]) {
				swapButton(buttons[emptyCellId],buttonClicked);
				emptyCellId = emptyCellId - 1;
				break;}
			if(buttonClicked == buttons[emptyCellId - 4]) {
					swapButton(buttons[emptyCellId],buttonClicked);
					emptyCellId = emptyCellId - 4;
					break;
				}
		}
		
		return emptyCellId;

	}
	public int[] getRandomNumbersForGrid() {//Generating random array of 1 to 15 without repetition 
		int arr[] = new int[15];
		
		for(int i=0;i<15;i++) 
		{
			int a = getRandomNumber();
			if((a<1)||(a>15)){
				i--;
				continue;
			}
			int flag=0;
			for(int j=0;j<15;j++) 
				if(a==arr[j]) {
				    flag=-1;
	                break;
	     		}
			if(flag==0)
				arr[i]=a;
			else
				i--;
			
		}
		
		
		return arr;
	}
	public boolean checkForWinner(Button[] buttons)
	{
		boolean winner = true;
		
		// Your Logic here
		int[] ar=getIntegerArrayOfButtonIds(buttons);
		int flag=0;
		for(int k=0;k<14;k++) {  //To check if the array is ordered from 1 to 15
			if(ar[k]!=k+1) {
				flag=-1;
				break;
			}
		}
		if(flag==-1)
			winner=false;

		return winner;
	}
}