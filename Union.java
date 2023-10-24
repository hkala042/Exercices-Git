public interface Comparable<E> {
	int compareTo (E other);
}







public class Union implements Comparable<Union>{
	private int first = 0;
	private int second = 0;
	private int third = 0;
	
	
	public Union(int first, int second, int third){
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public int getfirst(){
		return first;
	}
	
	public int getsecond(){
		return second;
	}
	
	public int getthird(){
		return third;
	}
	
	
	
	public boolean equals(Union other){
		if ((this.first == other.getfirst() ) && (this.second == other.getsecond() ) && (this.third == other.getthird())){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		return Integer.toString(getfirst())+" :"+Integer.toString(getsecond())+" :"+Integer.toString(getthird());
	}
	
	public int compareTo(Union other){
		if (this.first<other.getfirst()){
			return -1;
		}
		else{
			if (this.first>other.getfirst()){
				return 1;
			}
		}
		else{
			if (this.second<other.getsecond()){
				return -1;
			}
		}
		else{
			if (this.second>other.getsecond()){
				return 1;
			}
		}
		else{
			if (this.third<other.getthird()){
				return -1;
			}
		}
		else{
			if (this.third>other.getthird()){
				return 1;
			}
		}
		else{
			return 0;
		}
		
	
	
}