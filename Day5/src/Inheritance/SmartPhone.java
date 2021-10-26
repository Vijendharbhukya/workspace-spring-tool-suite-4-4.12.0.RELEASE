package Inheritance;

	public class SmartPhone extends FeaturePhone { // multilevel inheritance
		void camera() {
			System.out.println("Snap a pic");
		}

		void music() {
			System.out.println("Play music with Dolby");
		}
	}