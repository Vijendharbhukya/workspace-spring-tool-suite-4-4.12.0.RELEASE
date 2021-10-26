package Day4;

public class ThisDemo {

		static int num1;
		int num2;

		static void staticMethod() {
			System.out.println(ThisDemo.num1);
			ThisDemo obj = new ThisDemo();
			System.out.println(obj.num2);
		}

		void nonStaticMethod() {
			System.out.println(ThisDemo.num1);
			System.out.println(this.num2);
		}

		public static void main(String[] args) {

			ThisDemo.staticMethod();
			ThisDemo obj = new ThisDemo();
			obj.nonStaticMethod();

		}

	
	}


