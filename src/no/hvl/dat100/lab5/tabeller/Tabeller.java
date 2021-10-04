package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
package no.hvl.dat100.lab5.tabeller;

public class O2A1 {
    public static void main(String arg[])
    {  
         
        for (int i = 1; i <= 10; ++i)
            System.out.println(i);
    }
}
// a

	public static String tilStreng(int[] tabell) {
		  String resultat = "";
		  for (int x : tabell) {
		    resultat += x;
		  }
		  return resultat;
		}

//
	public static int summer(int[] tabell) {
		int sum=0;
        for (int i=0; i<tabell.length; i++) {
            
            sum+= tabell[i];
        }
            return sum;
    }

//

	public static boolean finnesTall(int[] tabell, int tall) {

        boolean finnes=false;
        for (int i : tabell) {
            if (i == tall) {
                finnes = true;
            }
            
        }
        return finnes;
    }
//

    public static void main(String[] args)
    Integer[] tabell = {1,3,5,7};
     
    System.out.println("Tabell:");
    for(int i=0;i<tabell.length;i++)
         System.out.print(tabell[i] + "  ");
     
    System.out.println();
     
    System.out.println("Reversert tabell:");
         for(int i=tabell.length-1;i>=0;i--)
         System.out.print(tabell[i] + "  ");
    }
//
public static boolean erSortert(int[] a) {
	for (int i = 1; i < a.length; i++)
		if (a[i-1] > a[i]) return false; 
	
	return true}
	
