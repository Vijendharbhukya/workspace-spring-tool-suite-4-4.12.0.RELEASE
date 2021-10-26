package Inheritance;

	public class FeaturePhone extends Phone { // single inheritance

		private void mms() {
			System.out.println("Send MMS");
		}

		void music() {
			System.out.println("Play music");
		}
	}