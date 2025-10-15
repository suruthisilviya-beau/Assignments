package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
	
		Browser eb = new Browser();
		eb.launchBrowser("Chrome");
		System.out.println(eb.loadurl());
		
		Browser edgeBrowser = new Browser();
		edgeBrowser.launchBrowser("Edge");
		System.out.println(edgeBrowser.loadurl());

	}

}
