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
        	Philosophers operat�ons;
		if(counter%k==0) {
			
			operat�ons= new Philosophers(k-1, counter%k, counter%k);
			
		}
		else {
			
			operat�ons= new Philosophers(counter%k-1, counter%k, counter%k);
			
		}
		if(sticks.get(operat�ons.getLeft_sticks())==1 & sticks.get(operat�ons.getRight_sticks())==1) {
			Eat eat =new  Eat(operat�ons,sticks);
			eat.take(operat�ons.getLeft_sticks(), sticks);
			eat.take(operat�ons.getRight_sticks(), sticks);
			
			
			Thread philozof= new Thread(eat);		
	 		
			   philozof.start(); 
		
		}else {
			
			System.out.println(operat�ons.getI()+ " thinking");
		}
           
		   counter++;
		   		   
			}
		
		
	}

}
