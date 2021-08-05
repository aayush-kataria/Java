package question7;

import java.io.IOException;

public class InputExp extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InputExp(int n) {
		super("Number Can't be equal" + n);
	}

}


class TwoException{
	int a = 5;
	public void throwException(int b) throws InputExp, IOException{
		if(b == a)
			throw new InputExp(b);
		else {
			throw new IOException();
		}
	}
}