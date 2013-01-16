import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ChoosePizza{
	
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
			System.out.println("Wybrałes pizze Margerite. Koszt mała:10zł Duża 14zł Mega 45 zł");
			System.out.println("Skladniki: Sos, Ser, Szynka");
		}
		void Capricossa(){
		System.out.println("Wybrałes pizze Capricosse. Koszt mała:11zł Duża 15zł Mega 46 zł");
		}
		void Salami(){
		System.out.println("Wybrałes pizze Salami. Koszt mała:12zł Duża 16zł Mega 47 zł");
		}
		void Pepperoni(){
		System.out.println("Wybrałes pizze Pepperoni. Koszt mała:13zł Duża 17zł Mega 48 zł");
		}
		void Mafijna(){
		System.out.println("Wybrałes pizze Mafijna. Koszt mała:14zł Duża 18zł Mega 49 zł");
		}
		void Chilli(){
		System.out.println("Wybrałes pizze ChiliKoszt 16 ");
		}
		void Bolognese(){
		System.out.println("Wybrałes pizze Bolognese. Koszt mała:16zł Duża 20zł Mega 51 zł");
		}
void choosepizza() throws IOException
{
	String s3;
	int x3;
	System.out.println("Podaj jaka pizze wybierasz");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
	s3 = stdin.readLine();
	x3 = Integer.parseInt(s3);
	
	if (x3 == 1){
		Margerita();
		}
		else
	if (x3 == 2){
		Capricossa();
		}
		else 
	if(x3 == 3){
		Salami();
		}
		else
	if(x3 == 4){
		Pepperoni();
			}
	if(x3 == 5){
		Mafijna();
		}
		else
	if(x3 == 6){
		Chilli();		
	}
	if(x3 == 7){
		Bolognese();
	}
		else
			if(x3 >7){
				System.out.println("Nie ma takiej pizzy. Podaj jeszcze raz");
				choosepizza();
			}
	}


void pay() throws IOException{
	String s4;
	int x4;
	
	System.out.println("Podaj ilosc jaką placisz?");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
	s4 = stdin.readLine();
	x4 = Integer.parseInt(s4);
	
}
}
