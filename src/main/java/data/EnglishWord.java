package data;

public class EnglishWord {
	  private int id,lessonNumber;
      String word, translation;

      public EnglishWord(int id,  String word, String translation, int lessonNumber)
      {
          this.id = id;
          this.lessonNumber = lessonNumber;
          this.word = word;
          this.translation = translation;
      }
      public void setId(int id)
      {
          this.id = id;
      }
      public int getId()
      {
          return id;
      }
      public void setLessonNumber(int lessonNumber)
      {
          this.lessonNumber = lessonNumber;
      }
      public int getLessonNumber()
      {
          return lessonNumber;
      }
      public void setWord(String word)
      {
          this.word = word;
      }
      public String getWord()
      {
          return word;
      }
      public void setTranslation(String translation)
      {
          this.translation = translation;
      }
      public String getTranslation()
      {
          return translation;
      }
}
