import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad{
	Scanner sc = new Scanner(System.in);
	private String password;
	
	public SecuredNotepad(String name, Page[] pages, int pageNumbers, String password) {
		super(name, pages, pageNumbers);
		if (this.isStrongPassword(password)) {
			this.password = password;
		}	
		else {
			System.out.println("The password is not enought strong");			
//			ако при	създаването не се въведе силна парола, 
//			да не се създава обект от тип SecuredNotepad ???
		}		
	}	
	
	public boolean isStrongPassword(String pass){
		boolean length = false;
		if(pass.length() >= 5){
			length = true;
		}
		boolean small = false;
		for (int i = 0; i < pass.length(); i++) {
			if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
				small = true;
				break;
			}
		}
		boolean big = false;
		for (int i = 0; i < pass.length(); i++) {
			if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
				big = true;
				break;
			}
		}
		boolean digit = false;
		for (int i = 0; i < pass.length(); i++) {
			if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
				digit = true;
				break;
			}
		}
		
		if (length && small && big && digit) {
			return true;
		}
		else {
			return false;
		}
	}	
	
	public boolean checkPass(String password) {
		return this.password.equals(password) ? true : false;
	}

	@Override
	public void addText(Page[] pages, String text, int pageNum) {
		System.out.println("Please enter the password:");
		if (this.checkPass(sc.next())) {
			pages[pageNum].addText(text);
		} else {
			System.out.println("Wrong password");
			return;
		}
	}

	@Override
	public void addRemoveText(int pageNum, String text) {
		System.out.println("Please enter the password:");
		if (this.checkPass(sc.next())) {
			this.getPages()[pageNum].addText(text);	
		}
		else {
			System.out.println("Wrong password");
			return;
		}		
	}

	@Override
	public void removeText(int pageNum) {
		System.out.println("Please enter the password:");
		if (this.checkPass(sc.next())) {
			this.getPages()[pageNum].removeText();
		}
		else {
			System.out.println("Wrong password");
			return;
		}
	}

	@Override
	public void previewAllPages(Page[] pages) {
		System.out.println("Please enter the password:");
		if (this.checkPass(sc.next())) {
			for (int i = 0; i < this.getPages().length; i++) {
				this.getPages()[i].previewPage();
			}
		}
		else {
			System.out.println("Wrong password");
			return;
		}
	}

	@Override
	public boolean searchWord(String word) {
		System.out.println("Please enter the password:");
		if (this.checkPass(sc.next())) {
			return super.searchWord(word);
		}
		else {
			System.out.println("Wrong password");
		}
		return false;				
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println("Please enter the password:");
		if (this.checkPass(sc.next())) {
			super.printAllPagesWithDigits();
		}
		else {
			System.out.println("Wrong password");
		}
	}
	
	public Page[] getPages(){
		return super.getPages();
	}

}
