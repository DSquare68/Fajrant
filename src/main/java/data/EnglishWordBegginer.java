package data;

public class EnglishWordBegginer extends EnglishWord{
	String optionTwo,optionThree,OptionFour;

	
	public EnglishWordBegginer(int id, String word, String translation, int lessonNumber,String optionTwo,String optionThree,String optionFour) {
		super(id, word, translation, lessonNumber);
		this.optionTwo=optionTwo;
		this.optionThree=optionThree;
		this.OptionFour=optionFour;
	}
	
	public String getOptionTwo() {
		return optionTwo;
	}

	public void setOptionTwo(String optionTwo) {
		this.optionTwo = optionTwo;
	}

	public String getOptionThree() {
		return optionThree;
	}

	public void setOptionThree(String optionThree) {
		this.optionThree = optionThree;
	}

	public String getOptionFour() {
		return OptionFour;
	}

	public void setOptionFour(String optionFour) {
		OptionFour = optionFour;
	}

	public void setWord(EnglishWord englishWord) {
		setId(englishWord.getId());
		setLessonNumber(englishWord.getLessonNumber());
		setWord(englishWord.getWord());
		setTranslation(englishWord.getTranslation());
	}
	
}
