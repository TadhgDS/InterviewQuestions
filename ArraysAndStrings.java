import java.util.Arrays;


public class ArraysAndStrings {
	
	// Implement an algorithm to determine if a string has all unique characters. 
	// What if you can not use additional data structures?
	static void uniqueChars(String aString){ 
		boolean isUnique = true;
		for(int x=0; x<aString.length(); x++){
			for(int y=aString.length()-1; y>= x; y--){
				
				if(x!=y && aString.charAt(x) == aString.charAt(y)){
					System.out.println(aString.charAt(x) + " is not unique in the string " + aString);
					isUnique = false;
					break;
				}
			}
		}
		if(isUnique == true){
			System.out.println("the string " + aString + " has all unique characters!");
		}
	}
	
	//Write code to reverse a C-style String.
	static char[] reverseChar(char[] aChar){
		char[] newChar = new char [aChar.length];
		for(int x = aChar.length-1, y=0; x>=0; x--,y++){
			newChar[y] = aChar[x];
			
		}
		return newChar;
	}
	
	//Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer.
	//NOTE: One or two additional variables are fine, an extra copy of the array is not.
	//Follow up: write the test cases for this method
	static char[] removeDuplicates(char[] aString){
		int len = aString.length;
		
		for(int head = 0;head<len;head++){
			for(int tail = aString.length-1; tail > head; tail--){
				
				if(aString[head] == aString[tail] && tail+1 != len){
					aString[tail] = aString[tail+1];
					System.out.println(aString);
					
				}
				if(aString[len-1] == aString[head] && head!=len-1){
					len--;
					aString[len] = '\0';
				}		
			}			
		}
		return aString;
	}
	
	//Write a method to decide if two strings are anagrams or not.
	
	static boolean isAnagram(String strone, String strtwo){
		
		int len = strone.length();
		
		//Convert strings -> char
		char[] str1 = strone.toCharArray();
		char[] str2 = strtwo.toCharArray();

		//sort
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		//compare each elem
		for(int x = 0; x<len; x++){
			if(str1[x] != str2[x]){
				return false;
			}
		}
		return true;
	}
	
	
	//Replace all spaces in a string with '%20' 
	static String replaceSpaces(String str){
		str = str.replaceAll("\\s", "%20");
		return str;
	}
	
	public static void main(String[] args) {
    
		/*
    	
    	uniqueChars(hasnot);
    	uniqueChars(has);
    	
    	    	
    	char hey[] = "hey this is a char array".toCharArray();
    	System.out.println(reverseChar(hey));
    	*/
	//	char hey[] = "ggarcaoskopkxokokocxabcccccddddeeeeeeffffeeeebbbccccdddaaa".toCharArray();
	//  System.out.println(removeDuplicates(hey));
		
		String has1 = "ddddeeeeeeffffeeeebbbccccdddaaaggarcaoskopkxokokocxabccccc";
    	String has2 = "ggarcaoskopkxokokocxabcccccddddeeeeeeffffeeeebbbccccdddaaa";	
    	System.out.println(replaceSpaces("a b c d e f g "));

    }
}
