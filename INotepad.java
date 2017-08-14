
public interface INotepad {
	
	public void addText(Page[] pages, String text, int pageNum);
	
	public void addRemoveText(int pageNum, String text);
	
	public void removeText(int pageNum);
	
	public void previewAllPages(Page[] pages);
	
	public boolean searchWord(String word);
	
	public void printAllPagesWithDigits();
	
}
	
