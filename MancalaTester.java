
public class MancalaTester {
		
	    public static void main(String[] args) {
	    	MancalaGUI gui = new MancalaGUI();

	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                gui.initialize();
	            }
	        });
	    }
	}

