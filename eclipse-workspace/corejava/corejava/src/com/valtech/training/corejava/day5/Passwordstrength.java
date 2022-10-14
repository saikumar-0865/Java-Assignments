package com.valtech.training.corejava.day5;

public class Passwordstrength {
	int upper=0;
	int lower=0;
	int dig=0;
	int SpecialChars=0;
	int occuranceNumCount=0;
	int occuranceSplCount=0;
	int total=0;
	
	int count = 0;


public boolean checkSmaller(String str) {
	 int flag = 0;
	 if (str.length() < 8)
	 return false;
	 for (char ch=0;ch<str.length();ch++) 
	 {
		 if (Character.isLowerCase(ch)) 
		 {
			 if (flag == 0) 
			 {
				 count += 5;
				 flag = 1;
				 return true;
				 } 
			 else 
			 {
				 break;
				 }
			 }
		 }
	 return true;
}


public boolean checkCapital(String str) {
	 int flag = 0;
	 if (str.length() < 8)
		 return false;
	 for (char ch=0; ch<str.length();ch++) {
		 if (!Character.isLowerCase(ch)) {
		 if (flag == 0) {
			 count += 5;
		     flag = 1;
		     return true;
		 } 
		 else {
			 break;
			 }
		 }
    }
	 return true;
}


public boolean checkNum(String str) {
	int flag = 0;
	for (char ch = 0; ch < str.length(); ch++) {
		if (Character.isDigit(ch)) {
			if (flag == 0) {
				count += 5;
				flag = 1;
				return true;
            }
			else {
           	 count += 1;            	 
           	 }
			} 
		else {
			return true;               
			}
		}
	return false;
}


public int checkSpecialChars(String str) {
	int flag = 0;
	String specialChars = "!@#$%^&*";
	for (int i = 0; i < str.length(); i++) {
		String strChar = Character.toString(str.charAt(i));
		if(specialChars.contains(strChar)) {
			if(flag == 0) {
				count += 5;
				flag = 1;
			}
			else {
				count += 2;
			}
		}
	}
	return count;
	}


	static String a="Va$125aa";
	public long checkPassWord(String a) {
		char[]p=a.toCharArray();
		System.out.println(p.length);
		if(p.length<8) {
			total=p.length;
		}
		else {
		for(int i=0;i<=p.length-1;i++) {
			if(Character.isLowerCase(p[i])) {
				lower=5;
			}
			System.out.println("a"+lower);
			if(Character.isUpperCase(p[i])) {
				upper=5;
			}
			
			if(p[i]>='0' && p[i]<='9') {
				occuranceNumCount++;
				if(occuranceNumCount>1) {
					dig+=1;
				}
				else {
					dig=5;
				}
				
			}
			if(p[i]=='#'||p[i]=='$'|| p[i]=='@'||p[i]=='%'||p[i]=='!'||p[i]=='%'||p[i]=='&'||p[i]=='^'||p[i]=='*'||p[i]=='('||p[i]==')'||p[i]=='['||p[i]==']') {
				
				occuranceSplCount++;
				if(occuranceSplCount>1) {
					SpecialChars+=2;
				}
				else {
					SpecialChars=5;
				}
			
			}
		}
		
		total=lower+dig+SpecialChars+upper;
		
		return total;
	}
		return 0;
	}
	public String checkPasswordStrength(String a) {
		checkPassWord(a);
		if(total>25) {
			return("Strong");
		}
		if(total<=25 && total>20) {
			return ("Moderate");
		}
		if(total<=20 && total>=8) {
			return ("Weak");
		}
		return "Weak Password";
	}

}















































































































/*
package com.valtech.training.corejava.day5;

public class Passwordstrength {
	int cnt = 0;
	public char[] value;


public boolean checklower(String str) {
	 int flag = 0;
	 if (str.length() < 8)
	 return false;
	 for (char ch=0;ch<str.length();ch++) 
	 {
		 if (Character.isLowerCase(ch)) 
		 {
			 if (flag == 0) 
			 {
				 cnt += 5;
				 flag = 1;
				 return true;
				 } 
			 else 
			 {
				 break;
				 }
			 }
		 }
	 return true;
}


public boolean checkupper(String str) {
	 int flag = 0;
	 if (str.length() < 8)
		 return false;
	 for (char ch=0; ch<str.length();ch++) {
		 if (!Character.isLowerCase(ch)) {
		 if (flag == 0) {
			 cnt += 5;
		     flag = 1;
		     return true;
		 } 
		 else {
			 break;
			 }
		 }
     }
	 return true;
}


public boolean checkdigit(String str) {
	int flag = 0;
	for (char ch = 0; ch < str.length(); ch++) {
		if (Character.isDigit(ch)) {
			if (flag == 0) {
				cnt += 5;
				flag = 1;
				return true;
             }
			else {
            	 cnt += 1;            	 
            	 }
			} 
		else {
			return true;               
			}
		}
	return false;
}


public int checkspecialchar(String str) {
	int flag = 0;
	String specialChars = "!@#$%^&*";
	for (int i = 0; i < str.length(); i++) {
		String strChar = Character.toString(str.charAt(i));
		if(specialChars.contains(strChar)) {
			if(flag == 0) {
				cnt += 5;
				flag = 1;
			}
			else {
				cnt += 2;
			}
		}
	}
	return cnt;
	}


public String checkPasswordStrength(String a) {
	checkPasswordStrength(a);
	if(cnt>25) {
		return ("Strong Password");
	}
	if(cnt<=25 && cnt>20) {
		return ("Moderate Password");
	}
	if(cnt<=20 && cnt>=8) {
		return ("Weak Password");
	}
	return "Weak Password";
}

}*/

/*package com.valtech.training.corejava.day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Passwordstrength {
		long valueUpper=0;
		long valueLower=0;
		long valueNumber=0;
		long valueSpecial=0;
		long numberOccurance=0;
		long spchOccurance=0;
		long totalValue=0;
		public char[] value;
		public long checkPassWord(String a) {
			char[]p=a.toCharArray();
			for(char i:p) {
				if(Character.isLowerCase(i)) {
					valueLower=5;
				}
				
				if(Character.isUpperCase(i)) {
					valueUpper=5;
				}
				if((int)(i)>=48 && (int)(i)<=57) {
					numberOccurance++;
					if(numberOccurance>1) {
						valueNumber+=1;
					}
					else {
						valueNumber+=5;
					}
					
				}
				if((int)i>=33 && (int)i<=47) {
					
					spchOccurance++;
					if(spchOccurance>1) {
						valueSpecial+=2;
					}
					else {
						valueSpecial+=5;
					}
					
				}
			}
			totalValue=valueLower+valueNumber+valueSpecial+valueUpper;
			return totalValue;
		}
		public String checkPasswordStrength(String a) {
			checkPassWord(a);
			if(totalValue>25) {
				return("Strong");
			}
			if(totalValue<=25 && totalValue>20) {
				return ("Moderate");
			}
			if(totalValue<=20 && totalValue>=8) {
				return ("Weak");
			}
			return "Weak Password";
		}
	

}
*/