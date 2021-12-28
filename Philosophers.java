import java.util.ArrayList;

public class Philosophers {

	private int left_sticks;
	private int right_sticks;
	private int i;
	
	public  Philosophers(int left_sticks,int right_sticks,int i) {
      
		this.i=i;
		this.left_sticks=left_sticks;
		this.right_sticks=right_sticks;

	}

	public int getLeft_sticks() {
		return left_sticks;
	}

	public void setLeft_sticks(int left_sticks) {
		this.left_sticks = left_sticks;
	}

	public int getRight_sticks() {
		return right_sticks;
	}

	public void setRight_sticks(int right_sticks) {
		this.right_sticks = right_sticks;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	   						
	}
	
	

