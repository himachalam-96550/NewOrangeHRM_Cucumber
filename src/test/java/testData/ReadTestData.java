package testData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReadTestData {

	
	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
	// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
	/* ObjectMapper om = new ObjectMapper();
	Root root = om.readValue(myJsonString, Root.class); */
	/*
	 * public static class LoginDetails{
	 * 
	 * @JsonProperty("UserName") public String userName;
	 * 
	 * @JsonProperty("Password") public String password;
	 * 
	 * @JsonProperty("Url") public String Url; }
	 * 
	 * public static class Root{
	 * 
	 * @JsonProperty("Login_Details") public LoginDetails login_Details; }
	 */


	public static class InvalidLoginData{
	    @JsonProperty("UserName") 
	    public String userName;
	    @JsonProperty("Password") 
	    public String password;
	    @JsonProperty("Error_Message") 
	    public String Error_Message;
	}

	public static class LoginDetails{
	    @JsonProperty("UserName") 
	    public String userName;
	    @JsonProperty("Password") 
	    public String password;
	    @JsonProperty("Url") 
	    public String url;
	}

	public static class Root{
	    @JsonProperty("Login_Details") 
	    public LoginDetails login_Details;
	    @JsonProperty("Invalid_Login_Data") 
	    public InvalidLoginData invalid_Login_Data;
	}

	
}


