
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
}


