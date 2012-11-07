import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ChoosePizza {
	
int cake(int c){
			int a=1;
			for(int i=0; i<a;i++){
				System.out.println("Wybor pizzy" +c);
			}
			
			switch(c){
			default:
			case 1: Margerita(); break;
			case 2: Capricossa(); break;
			case 3: Salami(); break;
			case 4: Pepperoni(); break;
			case 5: Mafijna(); break;
			case 6: Chilli(); break;
			case 7: Bolognese(); break;
			}
			return a;
		}
		void Margerita(){
			System.out.println("Wybrałes pizze Margerite");
		}
		void Capricossa(){
		System.out.println("Wybrałes pizze Capricosse");
		}
		void Salami(){
		System.out.println("Wybrałes pizze Salami");
		}
		void Pepperoni(){
		System.out.println("Wybrałes pizze Pepperoni");
		}
		void Mafijna(){
		System.out.println("Wybrałes pizze Mafijna");
		}
		void Chilli(){
		System.out.println("Wybrałes pizze Chili");
		}
		void Bolognese(){
		System.out.println("Wybrałes pizze Bolognese");
		}
void choosepizza() throws IOException{
	String s3;
	int x3;
	System.out.println("Podaj jaka pizze wybierasz");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
	s3 = stdin.readLine();
	x3 = Integer.parseInt(s3);
	
	if (x3 == 1){
		System.out.println("Wybrałes Margeritte");
		}
		else
	if (x3 == 2){
		System.out.println("Wybrałes Capricosse");

		}
		else 
	if(x3 == 3){
		System.out.println("Wybrałes Salami");
		}
		else
	if(x3 == 4){
		System.out.println("Wybrałes Pepperoni");
			}
	if(x3 == 5){
		System.out.println("Wybrałes Mafijna");
		}
		else
	if(x3 == 6){
		System.out.println("Wybrałes Chili");
				}
	if(x3 == 7){
		System.out.println("Wybrałes Bolognese");
		}
		else
			if(x3 >7){
				System.out.println("Nie ma takiego ciasta. Podaj jeszcze raz");
				choosepizza();
			}
	}
}



