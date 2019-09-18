public class Red7Card implements R7Comparable{
	private int number; // num on card
	private String color;
	
	public Red7Card(String clr, int num){
		color = clr;
		number = num;
	}
	
	public int getNumber(){
		return number;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getColorInd(){
		return R7Comparable.getColorId(color);
	}
	
	public int compareTo(R7Comparable obj){
		return obj.getOverallVal();
	}
	
	public String toString(){
		// what is this tostring going to be???
		return "hi";
	}
}