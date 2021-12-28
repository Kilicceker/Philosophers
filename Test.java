import java.util.ArrayList;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ArrayList<Integer> sticks=new ArrayList<>();
        
        int k=5;
        for (int i = 1; i <= k; i++)
        {
            sticks.add(1);   //all sticks 1 free
        }
        
        
        int counter=0;

        
        while (counter<30) {
        	Philosophers operatýons;
		if(counter%k==0) {
			
			operatýons= new Philosophers(k-1, counter%k, counter%k);
			
		}
		else {
			
			operatýons= new Philosophers(counter%k-1, counter%k, counter%k);
			
		}
		if(sticks.get(operatýons.getLeft_sticks())==1 & sticks.get(operatýons.getRight_sticks())==1) {
			Eat eat =new  Eat(operatýons,sticks);
			eat.take(operatýons.getLeft_sticks(), sticks);
			eat.take(operatýons.getRight_sticks(), sticks);
			
			
			Thread philozof= new Thread(eat);		
	 		
			   philozof.start(); 
		
		}else {
			
			System.out.println(operatýons.getI()+ " thinking");
		}
           
		   counter++;
		   		   
			}
		
		
	}

}
