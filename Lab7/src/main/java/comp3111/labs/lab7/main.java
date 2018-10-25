/**
 * 
 */
package comp3111.labs.lab7;

/**
 * @author kevinw
 * 
 * The coding style is bad in purpose.
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animals[] = new Animal[10];
		for (int i = 0; i < animals.length; i++)
			animals[i] = new Animal();
		
		for (int iii = 0; iii < 10; iii++) {
			int ii = 0;
			for (; ii < 100 && animals[iii].isAlive() ; ii++) {
				System.out.print(animals[iii].getWeight() + " ");
				animals[iii].eat();
				if (ii % 3 == 0)
				animals[iii].poo();
			}
		}

	}
	

}
