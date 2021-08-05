package question6;

public class InputException extends Exception{
		
		private static final long serialVersionUID = 1L;

		public InputException(int n) {
			super("Number Can't be greater than" + n);
		}
}
