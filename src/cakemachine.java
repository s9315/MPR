import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChooseCake  {

int cake(int b){
	int a=1;
	for(int i=0; i<a;i++){
		System.out.println("Typ ciasta" +b);
	}
	
	switch(b){
	default:
	case 1: Pojedyncze(); break;
	case 2: Podwojne(); break;
	case 3: Extra(); break;
	}
	return a;
}
void Pojedyncze(){
	System.out.println("Cienkie ciasto");
}
void Podwojne(){
System.out.println("Wybrales grube ciasto");
}
void Extra(){
System.out.println("Wybrales extra grube ciasto");
}
public void Choose(int i) {
	// TODO Auto-generated method stub
	
}
}
public class cakemachine{
	private static final int Y = 0;
	String s;
	String s1;
	String s2;
	int x1;
	int x2;

	
void Choose() throws IOException{
	System.out.println("Podaj jakie ciasto wybierasz");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
	s = stdin.readLine();
	x1 = Integer.parseInt(s);
	
if (x1 == 1){
	System.out.println("Wybrałes cienkie ciasto");
	}
	else
if (x1 == 2){
	System.out.println("Wybrałes grube ciasto");

	}
	else 
if(x1 == 3){
	System.out.println("Wybrałes extra ciasto");
	}
	else
		if(x1 >3){
			System.out.println("Nie ma takiego ciasta. Podaj jeszcze raz");
			Choose();
		}
}


void DeleteCake() throws IOException{
	System.out.println("Wybrales ciasto, jezeli chcesz przerwac wciśnij 0 lub 5 aby zatwierdzic");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
	s1 = stdin.readLine();
	x2 = Integer.parseInt(s1);
	
	if (x2 ==0){
		System.out.println("Kasujemy zamowienie");
	}
	else
	if(x2== 5){
		System.out.println("Robimy pizze teraz wplac pieniadze");
	}
	else
		if(x2 != 0 ^ x2 != 5){

	System.out.println("Nie ten klawisz podaj jeszcze raz");
	DeleteCake();
	}
}
}
