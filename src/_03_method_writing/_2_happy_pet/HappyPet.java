package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel =0;
	
	public static void main(String[] args) {
		String userPet = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		
		
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How would you like to take care of your pet? ", "pet simulation", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Groom" }, null);
		

			if(task==0) {
				cuddle(userPet);
			} else if(task==1) {
				feed(userPet);
			} else if (task==2) {
				groom(userPet);
			}
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	
	public static void cuddle(String pet) {
		if(pet.equals("dog")) {
			happinessLevel+=5;
			JOptionPane.showMessageDialog(null, "Dogs love being cuddled with!");
		}else if(pet.equals("cat")) {
			happinessLevel-=3;
			JOptionPane.showMessageDialog(null, "Cats hate being cuddled with");
		}else if(pet.equals("hamster")) {
			happinessLevel-=1;
			JOptionPane.showMessageDialog(null, "Hamsters aren't super fond with being pet.");
		}
		
	}
	
	public static void feed(String pet) {
		if(pet.equals("dog")) {
			happinessLevel+=3;
			JOptionPane.showMessageDialog(null, "Dogs love being fed!");
		} else if(pet.equals("cat")) {
			happinessLevel+=7;
			JOptionPane.showMessageDialog(null, "Cats love food!");
		} else if(pet.equals("hamster")) {
			happinessLevel+=7;
			JOptionPane.showMessageDialog(null, "Hamsters love food!");
		}
		
	}
	
	public static void groom(String pet) {
		if(pet.equals("dog")) {
			happinessLevel-=1;
			JOptionPane.showMessageDialog(null, "Dogs dislike being groomed");
		}else if(pet.equals("cat")) {
			happinessLevel+=3;
			JOptionPane.showMessageDialog(null, "Cats like being groomed");
		}else if(pet.equals("hamster")) {
			happinessLevel-=4;
			JOptionPane.showMessageDialog(null, "hamsters hate being groomed");
		}
		
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}