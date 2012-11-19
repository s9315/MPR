import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaSize{
void ChooseSize() throws IOException{
	String s4;
	int x4;
	System.out.println("Podaj wielkość pizzy w cm");
	System.out.println("20 cm -mała");
	System.out.println("30 cm - duza");
	System.out.println("60 cm - wielka");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
	s4 = stdin.readLine();
	x4 = Integer.parseInt(s4);
	
	if (x4 ==20 ){
		System.out.println("Wybrałes mala pizze");
		}
		else
	if (x4 == 30){
		System.out.println("Wybrałes duza pizze");

		}
		else 
	if(x4 == 60){
		System.out.println("Wybrałes wielka pizze");
		}
		else
			if(x4 <20 ^ x4 > 20 ^ x4<30 ^ x4>30 ^ x4<60 ^ x4>60){
				System.out.println("Nie ma takiej wielkości. Podaj jeszcze raz!");
				ChooseSize();
			}
	}
}


