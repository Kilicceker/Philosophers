import java.util.ArrayList;

public class Eat implements Runnable {
			private Philosophers operat�ons;
		    private ArrayList<Integer> arraylist;
			
	public Eat(Philosophers operat�ons,ArrayList<Integer> arraylist) {
				
			this.operat�ons=operat�ons;
	        this.arraylist=arraylist;
	        
	}
	
	@Override	
	public void run() {
					    		    			   				
			System.out.println(operat�ons.getI()+ " is eating");						
			
			put(operat�ons.getLeft_sticks(), arraylist);
			put(operat�ons.getRight_sticks(), arraylist);
	   
		}
	public void take(int index,ArrayList<Integer> chopsticklist) {
		
		ArrayList<Integer> chopstickList=chopsticklist;
		
		chopsticklist.set(index, 0);
		
	}
	public void put(int index,ArrayList<Integer> chopsticklist) {
		
		ArrayList<Integer> chopstickList=chopsticklist;
		
			chopsticklist.set(index, 1);
		
	}
}