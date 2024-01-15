package src.main.practice.others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HTTPREQ {

	public static void main(String[] args) {
		try {
		URL getURL=new URL("http://localhost:8080/users/mentors");
		URL postURL=new URL("http://localhost:8080/create_user");
		HttpURLConnection post=(HttpURLConnection)postURL.openConnection();
		HttpURLConnection get=(HttpURLConnection)getURL.openConnection();
		post.setDoOutput(true);
		post.setRequestMethod("POST");
		post.setRequestProperty("Content-Type", "application/json");
		String input="{\"id\":0,\"firstName\":\"lakshman\",\"lastName\":\"Y\",\"email\":\"lucky@gmail.com\",\"password\":\"lucky\",\"score\":0,\"gender\":\"male\",\"role\":\"mentor\",\"leadBy\":\"NA\",\"active\":true}";
		
	
		OutputStream os=post.getOutputStream();
		os.write(input.getBytes());
		os.flush();

		
		get.setRequestMethod("GET");
		BufferedReader br=new BufferedReader(new InputStreamReader(get.getInputStream()));
		
		String op="";
		while((op=br.readLine())!=null)
		{
			System.out.println(op);
		}
		}
		catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }
		}
}
