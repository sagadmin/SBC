package aufin.common.com;

import java.util.HashSet;
import java.util.Random;

public class TestData {
	
	final static String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	final static String NUMERIC_STRING = "23456789";
	final static String NUMERIC_DATE = "12";
	final static String NUMERIC_Year = "169785";
		public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
		builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
		}
		    
	public String getMobileNumber(){
		
		String aadhar[]={"7452158970","7456682105","8945743658","9899254789","9456878965","9012574569"};
		Random random = new Random();
		String getMobile=aadhar[random.nextInt(5)];
		return getMobile;
		}
	
	public static String randomaadharnumber(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*NUMERIC_STRING.length());
		builder.append(NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
		}
	
	
	public static String randomDateGenrated(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*NUMERIC_DATE.length());
		builder.append(NUMERIC_DATE.charAt(character));
		}
		return builder.toString();
		}
	
	public static String randomYearGenrated(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*NUMERIC_Year.length());
		builder.append(NUMERIC_Year.charAt(character));
		}
		return builder.toString();
		}
	    
	

}
