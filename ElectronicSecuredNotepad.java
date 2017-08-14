
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{

	private boolean started = false;
	
	public ElectronicSecuredNotepad(String name, Page[] pages, int pageNumbers, String password) {
		super(name, pages, pageNumbers, password);
		}

	@Override
	public void start() {		
		System.out.println("---Start Electronic Notepad---");
		this.started = true;
	}

	@Override
	public void stop() {
		System.out.println("---Stop Electronic Notepad---");		
		this.started = false;
	}

	@Override
	public boolean isStarted(){
		return this.started? true : false;			
	}
	
	@Override
	public void addText(Page[] pages, String text, int pageNum) {
		if (this.isStarted()) {
			super.addText(pages, text, pageNum);
		}
		else {
			System.out.println("Electronic Notepad is not started");
			return;
		}
	}
	
	@Override
	public void removeText(int pageNum) {
		if (this.isStarted()) {
			super.removeText(pageNum);
		}
		else {
			System.out.println("Electronic Notepad is not started");
			return;
		}		
	}
	
	@Override
	public void addRemoveText(int pageNum, String text) {
		if (this.isStarted()) {
			super.addRemoveText(pageNum, text);
		}
		else {
			System.out.println("Electronic Notepad is not started");
			return;
		}		
	}
	
	@Override
	public boolean searchWord(String word) {
		if (this.isStarted()) {
			return super.searchWord(word);
		}
		else {
			System.out.println("Electronic Notepad is not started");
			return false;//???
		}						
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if (this.isStarted()) {
			super.printAllPagesWithDigits();
		}
		else {
			System.out.println("Electronic Notepad is not started");		
		}			
	}
	
	@Override
	public void previewAllPages(Page[] pages) {
		if (this.isStarted()) {
			super.previewAllPages(pages);
		}
		else {
			System.out.println("Electronic Notepad is not started");		
		}			
	}	

}
