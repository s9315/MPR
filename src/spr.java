import java.io.IOException;


public class spr {

	public static void main(String[] args) throws IOException {
		ChooseCake a = new ChooseCake();
		cakemachine x = new cakemachine();
		ChoosePizza y = new ChoosePizza();
		PizzaSize b = new PizzaSize();

	y.choosepizza();
	x.Choose();
	b.ChooseSize();
	x.DeleteCake();
	
	}
}
