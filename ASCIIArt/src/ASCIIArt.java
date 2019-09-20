/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] args) {

		System.out.println("Can I have a double cheeseburger with extra ketchup and lettuce, please?");
		System.out.println("Cut the pickles, tomatoes, and mustard!");
		topBun();
		lettuce();
		ketchup();
		cheese();
		patty();
		lettuce();
		cheese();
		patty();
		ketchup();
		bottomBun();

	}

	public static void patty() {

		System.out.println("   ----------------");
		System.out.println("  (                )");
		System.out.println("   ----------------");

	}

	public static void cheese() {

		System.out.println("  __________________");
	}

	public static void topBun() {

		System.out.println("   ----------------   ");
		System.out.println("  /  \"   , .  *  ` \\  ");
		System.out.println(" /  -  *   '  \"  .  \\ ");
		System.out.println("----------------------");

	}

	public static void bottomBun() {

		System.out.println("----------------------");
		System.out.println(" \\                  /");
		System.out.println("  \\                /");
		System.out.println("   ----------------");
	}

	public static void lettuce() {

		System.out.println("   _   _   _   _   _");
		System.out.println("  / \\_/ \\_/ \\_/ \\_/ ");
	}

	public static void ketchup() {

		System.out.println("   ^^^^^^^^^^^^^^^^");
	}

}
