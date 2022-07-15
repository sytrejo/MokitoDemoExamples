package MokitoDemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;



class TestGameShow {
	
	//1. Write the test
	//2. Make the test compile
	//3. Watch the test fail
	//4. Do the minimum to get the test to pass
	//5. 
	
	

	@Test
	void testGuessTheWord_ReturnsTrueWhenTheContestantGuessesCorrectly() {
		//Arrange
		boolean expected = true;
		String magicWord = "Please";
		GameShow gameShow = new GameShow();
		gameShow.setWord(magicWord);
		
		//Need a contestant
		IContestant contestant = mock(IContestant.class);
		
		//pass the contestant into the gameShow
		gameShow.setContestant(contestant);
		
		//Need the contestant to guess correctly
		when(contestant.guess()).thenReturn(magicWord);
		
		//Act
		boolean actual = gameShow.guessTheWord();
		
		//Assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testGuessTheWord_ReturnsFalseWhenTheContestantGuessesIncorrectly() {
		//Arrange
		boolean expected = false;
		String magicWord = "Please";
		GameShow gameShow = new GameShow();
		gameShow.setWord(magicWord);
		
		//Need a contestant
		IContestant contestant = mock(IContestant.class);
		
		//pass the contestant into the gameShow
		gameShow.setContestant(contestant);
		
		//Need the contestant to guess
		String incorrectGuess = "Hello";
		when(contestant.guess()).thenReturn(incorrectGuess);
		
		//Act
		boolean actual = gameShow.guessTheWord();
		
		//Assert
		assertEquals(expected, actual);
	}

}
