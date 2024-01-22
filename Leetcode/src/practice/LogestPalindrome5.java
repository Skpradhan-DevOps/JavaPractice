package practice;

public class LogestPalindrome5 {
	
	public String longPalindrome(String s) {
		String res="";
		//odd length
		for(int i=0; i<s.length(); i++) {
			int l=i, r=i;
			while(l>=0 && r< s.length() && s.charAt(l)==s.charAt(r)) {
				if((r-l+1) > res.length()) {
					res=s.substring(l, r+1);
				}
				l-=1;
				r+=1;
			}
		}
		for(int i=0; i<s.length(); i++) {
			int l=i, r=i+1;
			while(l>=0 && r< s.length() && s.charAt(l)==s.charAt(r)) {
				if((r-l+1) > res.length()) {
					res=s.substring(l, r+1);
				}
				l-=1;
				r+=1;
			}
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogestPalindrome5 sol=new LogestPalindrome5();
		String s = "babad";
		String s2 = "cbbd";
		System.out.println(sol.longPalindrome(s2));

	}

}
