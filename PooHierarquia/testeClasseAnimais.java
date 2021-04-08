package PooHierarquia;

public class testeClasseAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro Cachorro1 = new Cachorro("Abgail", 3, "auauauauaua");
		Cavalo Cavalo1 = new Cavalo("Clinton", 37 ,"Rimririri");
		Preguica Preguica1 = new Preguica("Segunda", 49 , "uaaaaaa");
		
		Cachorro1.getNome();
		Cachorro1.getIdade();
		Cachorro1.getLatir();
		
		Cavalo1.getNome();
		Cavalo1.getIdade();
		Cavalo1.getLatir();
		
		Preguica1.getNome();
		Preguica1.getIdade();
		Preguica1.getLatir();
		
		System.out.println("\nO cachorro é " + Cachorro1.getNome());
		System.out.print("  ela tem " + Cachorro1.getIdade() + " Anos ");
		System.out.print(" ele faz " + Cachorro1.getLatir());
		
		System.out.println("\n------------------------------------------------");
		
		System.out.println("\nO cavalo é " + Cavalo1.getNome());
		System.out.print(" ele tem " + Cavalo1.getIdade()+ " Anos ");
		System.out.print("ele faz " + Cavalo1.getLatir());
		
		System.out.println("\n------------------------------------------------");
		
		System.out.println("\nA preguiça é" + Preguica1.getNome());
		System.out.print(" ela tem " + Preguica1.getIdade()+ " Anos ");
		System.out.print(" ela faz " + Preguica1.getLatir());
	}

}
