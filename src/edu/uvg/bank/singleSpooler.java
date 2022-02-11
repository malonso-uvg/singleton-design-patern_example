/**
 * 
 */
package edu.uvg.bank;

/**
 * @author MAAG
 *
 */
public class singleSpooler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PrintSpooler pr1, pr2;
		
		//open one spooler--this should always work
		System.out.println("Opening one spooler");
		
		try{
			pr1 = new PrintSpooler();
		} catch (SingletonException e){
			System.out.println(e.getMessage());
		}
		
		//try to open another spooler --should fail
		System.out.println("Opening two spoolers");
		try{
			pr2 = new PrintSpooler();
		} catch (SingletonException e) {
			System.out.println(e.getMessage());
		}

	}

}
