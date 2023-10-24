import java.util.*;


public class Tableaux {
	 public static  long x=10000;
	 static ArrayList<Character> tab1= new ArrayList<Character>();
	 static LinkedList<Object> tab2= new LinkedList<>();
	 static char[] tab3= new char[(int)x];
	
	public static void main(String[] args) {
		 StringBuilder stringBuilder = new StringBuilder();
		     // tab1
		        Random random = new Random();
		        long startTab1 = System.currentTimeMillis();
					for(int i=0;i<x;i++) {
					char randomChar = (char) (random.nextInt(26) + 'a');
						tab1.add(randomChar);
					}		
				for (Object element : tab1) {
		            stringBuilder.append(element);
		        }
				 String result1 = stringBuilder.toString();
			        long endTab1= System.currentTimeMillis();
					System.out.println((endTab1 - startTab1));
					
			// tab2
				 long startTab2 = System.currentTimeMillis();
					for(int i=0;i<x;i++) {
					char randomChar = (char) (random.nextInt(26) + 'a');
						tab2.add(i,randomChar);
					}
				for (Object element : tab2) {
			            stringBuilder.append(element);
				}
				String result2 = stringBuilder.toString();
				
				long endTab2= System.currentTimeMillis();
				System.out.println((endTab2 - startTab2));
			
		    // tab3
				long startTab3 = System.currentTimeMillis();
				for(int i=0;i<x;i++) {
				char randomChar = (char) (random.nextInt(26) + 'a');
					tab3[i] = randomChar;
				}		
			for (Object element : tab3) {
	            stringBuilder.append(element);
	        }
			 String result3 = stringBuilder.toString();
		        long endTab3= System.currentTimeMillis();
				System.out.println((endTab3 - startTab3));
				
		    }
	}

