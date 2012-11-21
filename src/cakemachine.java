import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class cakemachine  {
	String s;
	int x1;
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
	void Choose() throws IOException{
	System.out.println("Podaj jakie ciasto wybierasz");
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in),1);
	s = stdin.readLine();
	x1 = Integer.parseInt(s);
	
if (x1 == 1){
	//System.out.println("Wybrałes cienkie ciasto");
	Pojedyncze();
	}
	else
if (x1 == 2){
	//System.out.println("Wybrałes grube ciasto");
	Podwojne();
	}
	else 
if(x1 == 3){
	//System.out.println("Wybrałes extra ciasto");
	Extra();
	}
	else
		if(x1 >3){
			System.out.println("Nie ma takiego ciasta. Podaj jeszcze raz");
			Choose();
		}

	
}
}

