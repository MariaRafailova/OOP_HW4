
public class Page {
	private String title;
	private StringBuilder text = new StringBuilder();
	private int number;
	
	public Page(String title){
		this.title = title;
	}
	
	public void addText(String text){
		this.text.append(text);
	}
	
	public void removeText(){
		this.text.delete(0, this.text.length()-1);		
	}
	
	public void setNumber(int num){
		this.number = num;		
	}
	
	public int getNumber(){
		return this.number;
	}
		
	public void previewPage(){
		System.out.println(this.title + System.lineSeparator() + this.text);		
	}
//	String newText = "text1" + System.lineSeparator() + "text2";
	
	public boolean searchWord(String word){
		if(this.text.indexOf(word) >= 0){
			return true;
		}
		return false;
	}
	
	public boolean containsDigits(){
		for (int i = 0; i < this.text.length(); i++) {
			if (this.text.charAt(i) >= '0' && this.text.charAt(i) <='9') {
				return true;
			}
		}
		return false;
	}	

	public String getTitle(){
		return this.title;
	}
}
