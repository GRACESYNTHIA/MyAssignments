package week3.day1;

public class APIClient {
	

	public static void main(String[] args) {
	APIClient client=new APIClient();
	client.sendRequest("Hi");
	client.sendRequest("Hi","test",true);
	client.add(127l, 15l);
	
	}

	public void sendRequest(String endpoint) {
		System.out.println("verify the endpoint "+endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
		System.out.println("send request and verify the requeststatus " +endpoint +" "+requestBody);
	}
	
	public void add (int a,int b) {
		System.out.println("int "+a+b);
	}
	
	public void add (long a,long b) {
		System.out.println("long "+a+b);
	}
}
