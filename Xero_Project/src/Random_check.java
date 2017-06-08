import java.util.Random;

public  class Random_check   {
	
	public static String email(){
	
	int length= 5;
	String name="01234ghjnkuo";
	String first_domain="1234578hbfsery";
	String second_domain="ahjsioodmcllpomnyahjpo";
	
	Random random=new Random();
	String email=new String();
	
	StringBuilder sb= new StringBuilder(length);
	for(int i=0;i<length;i++)	
	sb.append(name.charAt(random.nextInt(name.length())));
	email+=sb;
	
	sb=new StringBuilder(length);
	for(int i=0;i<length;i++)	
	sb.append(first_domain.charAt(random.nextInt(name.length())));
	email+="@"+sb;
	
	sb=new StringBuilder(length);
	for(int i=0;i<length;i++)	
	sb.append(second_domain.charAt(random.nextInt(name.length())));
	email+="."+sb;
	
	return email;
	
	
	}
	
	
	

	public static String password() {
		
		final String data="12345nhgbvgipkjxnhsiosnklas";
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<21;i++)
		sb.append(data.charAt(random.nextInt(data.length())));
		return sb.toString();
		}




	public static String accountname() {
		final String data="12345nhgbvgipkjxnhsiosnklas";
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<30;i++)
		sb.append(data.charAt(random.nextInt(data.length())));
		return sb.toString();
		
	}



public static String accountno() {
		
		final String data="12345nhgbvgipkjxnhsiosnklas";
		Random random=new Random();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<20;i++)
		sb.append(data.charAt(random.nextInt(data.length())));
		return sb.toString();
		}
	




	}
		
	

		
		
		
		
		
	
	
	

