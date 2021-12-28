import java.util.ArrayList;

public class Eat implements Runnable {
			private Philosophers operatýons;
		    private ArrayList<Integer> arraylist;
			
	public Eat(Philosophers operatýons,ArrayList<Integer> arraylist) {
				
			this.operatýons=operatýons;
	        this.arraylist=arraylist;
	        
	}
	
	@Override	
	public void run() {
					    		    			   				
			System.out.println(operatýons.getI()+ " is eating");						
			
			put(operatýons.getLeft_sticks(), arraylist);
			put(operatýons.getRight_sticks(), arraylist);
	   
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