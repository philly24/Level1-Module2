
public class TeaMakerRunner {
public static void main(String[] args) {
	TeaBag tea = new TeaBag("Green"); 
	Kettle kettle = new Kettle();
	kettle.getWater();
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(tea, kettle.getWater());
}
}
