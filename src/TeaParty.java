import javax.swing.JOptionPane;

public class TeaParty {
    public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
      if (isWoman && isKnighted==true) {
		return "Hello Lady "+ name;
	}
    else if (isWoman==true) {
		return "Hello Ms. "+name; 
	} 
    else if(isWoman==false && isKnighted==false) {	
    	return "Hello Mr. "+name;
    }
    else {
    	System.out.println();
    	return "Hello Sir "+name;
    }
	
    }
}
