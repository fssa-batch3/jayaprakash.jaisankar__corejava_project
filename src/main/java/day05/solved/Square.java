package day05.solved;

public class Square extends Rectangle {

	private static final char[] numberOfSides = null;

	/**
	 * @param length
	 * @param breadth
	 * @throws Exception
	 */
	public Square(double sideLength) throws Exception {
		super();
		
	}
	
	public static void main(String[] args) {
		try {
		Square square = new Square(1.0);
		System.out.println(square.numberOfSides);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}