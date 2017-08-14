import java.util.Arrays;

public class NotepadDemo {
	public static void main(String[] args) {
		
		Page[] pages = new Page[10];		
		for (int i = 1; i < 10; i++) {
			pages[i] = new Page("Page"+i);
			pages[i].addText("Text"+i);
			pages[i].setNumber(i);
//			System.out.println(pages[i].previewPage());
		}
		
		System.out.println((pages[3].containsDigits())? 
				"Page3 contains digit":
				"Page3 doesn't contain digit");
		System.out.println((pages[1].searchWord("hi"))?
				"Page5 contains \"hi\"":
				"Page5 doesn't contain \"hi\"");	
		
		SimpleNotepad simple = new SimpleNotepad("Simple1", pages, 2);
		simple.addText(pages, " Additional text", 7);
		pages[7].previewPage();
		simple.addRemoveText(1, "New text");
		pages[1].previewPage();
		
		Page[] pagesS = new Page[5];
		for (int i = 1; i < 5; i++) {
			pagesS[i] = new Page("PageS"+i);
			pagesS[i].addText("TextS"+i);
			pagesS[i].setNumber(i);
		}
		
		SecuredNotepad secured = new SecuredNotepad("Secured", pagesS, 5, "Ab123");
		//password Ab123
		secured.addRemoveText(4," New secured text");
		secured.getPages()[4].previewPage();
		secured.addText(pagesS, " additional secured text", 1);
		secured.getPages()[1].previewPage();
		
		ElectronicSecuredNotepad electronic = new ElectronicSecuredNotepad("Electronic", pagesS, 5, "Ab567");
		//pass: Ab567
		electronic.start();
		electronic.addRemoveText(3, " New text");
		electronic.getPages()[3].previewPage();
		electronic.stop();
		electronic.addText(pagesS, " Additional text", 1);		
		
	}
}
