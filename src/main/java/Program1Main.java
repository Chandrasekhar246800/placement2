
public class Program1Main {
	public static void main(String[] args) {
		ProgramExample program = new ProgramExample(50);
		program.multiplication();
	}
}

class ProgramExample {
	int score = 85;
	
	protected void multiplication() {
		int result = score * 2;
		System.out.println(result);
		
		class InnerCalculator {
			void subtract() {
				System.out.println("Method local inner class executed");
			}
		}
	}
	
	{
		System.out.println("welcoming...");
		String currentDate = "November 19, 2025";
		System.out.println(currentDate);
	}
	
	public ProgramExample() {
		System.out.println("Default constructor called");
	}
	
	public ProgramExample(int value) {
		value = score + value;
		System.out.println(value);
	}
}
