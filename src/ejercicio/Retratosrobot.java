package ejercicio;

public class Retratosrobot {

	public static void main(String[] args) {
		
		String pelo1 = "WWWWWWWWW";
		String pelo2 = "\\\\\\//////";
		String pelo3 = "\"|||||||\"";
		String pelo4 = "|||||||||";
		String ojos1 = "| o   o |";
		String ojos2 = "|-(· ·)-|";
		String ojos3 = "|-(o o)-|";
		String ojos4 = "| \\   / |";
		String md1 = "@   j   @";
		String md2 = "{   \"   }";
		String md3 = "[   j   ]";
		String md4 = "<   -   >";
		String boca1 = "|  ===  |";
		String boca2 = "|   -   |";
		String boca3 = "|  ___  |";
		String boca4 = "|  ---  |";
		String barb1 = "\\_______/";
		String barb2 = "\\,,,,,,,/";
		String barb3 = "\\......./";
		String barb4 = "\\mmmmmmm/";
		String rep = "Si";
		
		if (rep == "Si") {
		//Pelo
		System.out.println("Opción 1: WWWWWWWWW");
		System.out.println("Opción 2: \\\\\\//////");
		System.out.println("Opción 3: \"|||||||\"");
		System.out.println("Opción 4: |||||||||");
		int pe = Integer.parseInt(IO.readln("Escoge el pelo de tu robot: "));
		
		//Ojos
		System.out.println("Opción 1: | o   o |");
		System.out.println("Opción 2: |-(· ·)-|");
		System.out.println("Opción 3: |-(o o)-|");
		System.out.println("Opción 4: | \\   / |");
		int oj = Integer.parseInt(IO.readln("Escoge los ojos de tu robot: "));
		
		//Orejas y nariz
		System.out.println("Opción 1: @   j   @");
		System.out.println("Opción 2: {   \"   }");
		System.out.println("Opción 3: [   j   ]");
		System.out.println("Opción 4: <   -   >");
		int on = Integer.parseInt(IO.readln("Escoge las orejas y la nariz de tu robot: "));
		
		//Boca
		System.out.println("Opción 1: |  ===  |");
		System.out.println("Opción 2: |   -   |");
		System.out.println("Opción 3: |  ___  |");
		System.out.println("Opción 4: |  ---  |");
		int bo = Integer.parseInt(IO.readln("Escoge la boca de tu robot: "));
		
		//Barbilla
		System.out.println("Opción 1: \\_______/");
		System.out.println("Opción 2: \\,,,,,,,/");
		System.out.println("Opción 3: \\......./");
		System.out.println("Opción 4: \\mmmmmmm/");
		int br = Integer.parseInt(IO.readln("Escoge la barbilla de tu robot: "));
		
		if (pe == 1)
			System.out.println(pelo1);
		else if (pe == 2)
			System.out.println(pelo2);
		else if (pe == 3)
			System.out.println(pelo3);
		else if (pe == 4)
			System.out.println(pelo4);
		if (oj == 1)
			System.out.println(ojos1);
		else if (oj == 2)
			System.out.println(ojos2);
		else if (oj == 3)
			System.out.println(ojos3);
		else if (oj == 4)
			System.out.println(ojos4);
		if (on == 1)
			System.out.println(md1);
		else if (on == 2)
			System.out.println(md2);
		else if (on == 3)
			System.out.println(md3);
		else if (on == 4)
			System.out.println(md4);
		if (bo == 1)
			System.out.println(boca1);
		else if (bo == 2)
			System.out.println(boca2);
		else if (bo == 3)
			System.out.println(boca3);
		else if (bo == 4)
			System.out.println(boca4);
		if (br == 1)
			System.out.println(barb1);
		else if (br == 2)
			System.out.println(barb2);
		else if (br == 3)
			System.out.println(barb3);
		else if (br == 4)
			System.out.println(barb4);
		rep = IO.readln("¿Quieres hacer otro robot? (Si/No)");
		};
	}
	
}

