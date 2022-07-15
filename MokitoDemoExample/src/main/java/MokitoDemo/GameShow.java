package MokitoDemo;

public class GameShow {
	
	private String word;
	private IContestant contestant;
	
	public void setWord(String word) {	
		this.word = word;
	
	}
	
	public void setContestant(IContestant contestant) {
		this.contestant = contestant;
		
	}
	
	public boolean guessTheWord() {
		
		String guess = contestant.guess();
		
		return guess.equals(word);
	
	}

}
