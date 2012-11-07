import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChooseCake {

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
}


void cake() throws IOException{
	System.out.println("Wybrales"+x1+"ciasto, jezeli chcesz przerwac wciśnij 0");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
	s1 = stdin.readLine();
	x2 = Integer.parseInt(s1);
	
	if (x2 == 0){
		System.out.println("Kasujemy zamowienie");
	}
	else
		System.out.println("Robimy");
}



public static void main(String[] args) throws IOException {
	ChooseCake a = new ChooseCake();
	cakemachine x = new cakemachine();

	a.Choose(1);
}
}

