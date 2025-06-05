package spaAssignments;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		String str="I kept up with the promise given to my mother";
		str=str.toLowerCase();
		
		int vowels=0,consonants=0;
		int len=str.length();
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}else {
				consonants++;
			}
		}
		System.out.println("Vowels     :"+vowels);
		System.out.println("Consonants :"+consonants);
	}

}
