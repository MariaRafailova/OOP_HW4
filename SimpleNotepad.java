
public class SimpleNotepad implements INotepad {
	private String name;
	private Page[] pages;
	private int pageNumbers;

	public SimpleNotepad(String name, Page[] pages, int pageNumbers) {
		this.name = name;
		this.pages = pages;
		this.pageNumbers = pageNumbers;
	}

	@Override
	public void addText(Page[] pages, String text, int pageNum) {
		pages[pageNum].addText(text);
	}

	@Override
	public void addRemoveText(int pageNum, String text) {
		this.pages[pageNum].removeText();
		this.pages[pageNum].addText(text);
	}

	@Override
	public void removeText(int pageNum) {
		this.pages[pageNum].removeText();
	}

	@Override
	public void previewAllPages(Page[] pages) {
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i].previewPage();
		}
	}
	
	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < this.pages.length; i++) {
			if(this.pages[i].searchWord(word)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		for (int i = 1; i < this.pages.length; i++) {
			if (pages[i].containsDigits()) {
				pages[i].previewPage();
				System.out.println(pages[i].getTitle());
			}
		}
	}

	public Page[] getPages(){
		return this.pages;
	}
	
}
