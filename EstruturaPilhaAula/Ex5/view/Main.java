package view;

import br.edu.fateczl.pilha.PilhaInt;

public class Main {

	public static void main(String[] args) {
		
		int x=0;
		int y=0;
		int vet[] = {1, 17, 20, 22, 25, 11, 39, 5, 15, 38, 26, 14};
		PilhaInt p = new PilhaInt();
		
		for(int a: vet) {
			p.push(a);
		}
		
		while(p.size()>1) {
			try {
				x = p.pop();
				y = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(x>y) {
				p.push(x);
			}
			else{
				p.push(y);
			}		
		}
		
		try {
			System.out.println(p.top());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
