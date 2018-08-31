package fresherPrograms;

public class AppendZeros {
	
	public static void main(String[] args) {
		String appended = "0000000000";
		String toAppend = "hari";
		
//		String rev = appended.substring(8, 10);
		String rev = appendZeroo("ri");
		System.out.println(rev);
//		int j= toAppend.length()-1;
//		String rev;
//		for(int i=appended.length()-1; i>=0; i-- ){
//			
//			appended.charAt(i) = toAppend.charAt(j);
//			j--;
//		}
		
	}
	
	public static String appendZeroo(String value){
		
		String zeros = "00000000";
		int num =zeros.length()-value.length();
		System.out.println(num);
		String rev = zeros.substring(0,num);
		int j= 0;
		
		for(int i=zeros.length()-1; i>=0; i-- ){
			 
		
			rev = rev + value.charAt(j) ;
			j++;
			if(j >  value.length()-1){
				break;
			}
		}
		return rev;
	}

}
