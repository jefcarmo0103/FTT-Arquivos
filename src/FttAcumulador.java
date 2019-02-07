import java.util.ArrayList;
import java.util.Scanner;

public class FttAcumulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("FTT Acumulador");
		System.out.println("I ai mano ...");
		
		ArrayList<String> userMessages = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		int acumulador = 0;
		
		while(sc.hasNext()){
			String userText = sc.nextLine();
			
			if(userText.isEmpty() || userText.equals(null))
				break;
			
			try{
				acumulador += Integer.parseInt(userText);	
			}
			catch(Exception e){
				userMessages.add(userText);
				System.err.println("Ops !!");
				e.printStackTrace();
			}
			
			System.out.println("Valor Acumulado: " + acumulador);
		}
			
		
		sc.close();
		
		for(String texts : userMessages){
			System.out.println(texts);
		}
	}

}
