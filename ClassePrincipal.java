import java.util.Random;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		String arrNoms[] = {"Joan","Quim","Aleix","Pauri","Rub�n","Pacheco","Pau","Nil","Gerard","Carlos","Bouzas","Gerard","Josep","Pabon","Jou","Mart�","Marcel","Xavi","Gilatos","Sergio","Barbancho"};
		String arrParelles[][] = new String[10][2];
		String arrComprobaci�[] = new String [arrNoms.length];
		
		for (int i=0; i<arrParelles.length; i++) {
			System.out.println("");
			for (int j=0; j<arrParelles[i].length; j++) {
				arrParelles[i][j] = (arrNoms[new Random().nextInt(arrNoms.length)]);
				arrComprobaci�[j] = (arrParelles[i][j]);
				for (int k=0; k<arrComprobaci�.length; k++) {
					if (arrComprobaci�[k] == (arrParelles[i][j])) {
						arrParelles[i][j] = (arrNoms[new Random().nextInt(arrNoms.length)]);
					}
				}
				System.out.print(arrParelles[i][j]+" ");
			}
		}
		
	}
}