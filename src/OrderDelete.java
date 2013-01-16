import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OrderDelete{
	String s1;
	int x2;
int END(int b){
	int a=1;
	for(int i=0; i<a;i++){
		System.out.println("Akceptacja" +b);
	}
	
	switch(b){
	default:
	case 2: Akceptacja(); break;
	case 1: Przerwanie(); break;}
	return a;
}
void Akceptacja(){
	System.out.println("Pizza zakceptowana");
}
void Przerwanie(){
System.out.println("Przerwanie wyboru");
}

void DeleteCake() throws IOException{
	System.out.println("Wybrales pizze, jezeli chcesz przerwac wciśnij 1 lub 2 aby zatwierdzic");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
	s1 = stdin.readLine();
	x2 = Integer.parseInt(s1);
	
	if (x2 ==1){
		//System.out.println("Kasujemy zamowienie");
		Przerwanie();
	}
	else
	if(x2== 2){
		//System.out.println("Robimy pizze teraz wplac pieniadze");
		Akceptacja();
	}
	else
		if(x2>0 ^ x2<0){

	System.out.println("Nie ten klawisz podaj jeszcze raz");
	
	DeleteCake();
	}
}
}