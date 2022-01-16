package assignment6;

public class UC1test {


public static void main(String args[]) {
	String sentence ="To be or not to be";
	MyHashMap<String, Integer> myhashmap = new MyHashMap<>();
	 String [] words = sentence.toLowerCase().split(" ");
	 for( String word : words) {
		 //System.out.println("word"+ word);
		 Integer value= myhashmap.get(word);
		 if (value== null )value=1;
		 else value= value+1;
		 myhashmap.add( word,  value);
		 
	 }
	  int frequency = myhashmap.get("to");
			  System.out.println(myhashmap);
	  System.out.println(frequency);
}
}
