import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String poptype = JOptionPane.showInputDialog("what flavor"); 
	String min = JOptionPane.showInputDialog("how long do you want it in for?"); 
	int time = Integer.parseInt(min);
	Popcorn pop = new Popcorn(poptype);
	pop.applyHeat();
	pop.eat();
	Microwave micro = new Microwave();
	micro.putInMicrowave(pop);
	micro.setTime(time);
	micro.startMicrowave();

}
}
