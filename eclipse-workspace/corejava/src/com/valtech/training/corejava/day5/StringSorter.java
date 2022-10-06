package com.valtech.training.corejava.day5;

import java.util.Comparator;

public class StringSorter implements Comparator<String> {

	
         @Override
		public int compare(String s1, String s2) {
		
				return s1.length() - s2.length();
		}

		
         public int vowelCount(String s1) {
        	 String vowels = "AaEeIiOoUu";
        	 int count =0;
        	 for(int i =0 ;i<s1.length(); i++) {
        		 char s4 = s1.charAt(i);
        		 if(vowels.contains(""+s4)) {
        			 count++;
        		 }
        	 }
        	 return count;
         }

         
         public int checkAlphabet(String s1, String s2) {
        	 
        	 return s1.compareTo(s2);
        	 
         }
         
        }























































//	public int checkVowel(String s1, String s2) {
//	// TODO Auto-generated method stub
//	
//	
//	
//
//	
//	int counts1= 0; int counts2 = 0;
//	
//	for (int i = 0; i < s1.length(); i++) {
//            // check if char[i] is vowel
//           if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'A' || s1.charAt(i) == 'E'
//                || s1.charAt(i) == 'i' ||  s1.charAt(i) =='O'
//                || s1.charAt(i) == 'o' || s1.charAt(i) =='U'
//                || s1.charAt(i) == 'u') {
//             
//                counts1++;
//            }
//        }
//	
//	for (int i = 0; i < s2.length(); i++) {
//        
//        if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'A' || s2.charAt(i) == 'E' || s2.charAt(i) == 'I'
//            || s2.charAt(i) == 'i' || s2.charAt(i) =='O' || s2.charAt(i) == 'U'
//            || s2.charAt(i) == 'o'
//            || s2.charAt(i) == 'u') {
//          
//            counts2++;
//        }
//        
//        if(counts1 > counts2 ) {
//        	
//        	
//        	return +1;
//        }
//        
//       if(counts1 < counts2)  return -1;
//       
////       if(counts1 == counts2) {
////    	   
////    	   return checkAlphabet(s1,s2);
////    	   
////       }
////       
// 
//        
// }
//	 
//      return 0;
//	
//	
//}


