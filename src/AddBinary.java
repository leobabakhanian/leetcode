import java.util.*;

public class AddBinary {

	public String addBinary(String a, String b) {
        
		StringBuilder sb = new StringBuilder();
		
		int i = a.length() - 1, j = b.length() - 1, remainder = 0;
		
		while(i >= 0 || j >= 0) {
			int sum = remainder;
			
			if(j >= 0) sum += b.charAt(j--) - '0';
			if(i >= 0) sum += a.charAt(i--) - '0';
			
			sb.append(sum % 2);
			remainder = sum / 2;
		}
		
		if(remainder != 0)
			sb.append(remainder);
		
		return sb.reverse().toString();
    }
}
