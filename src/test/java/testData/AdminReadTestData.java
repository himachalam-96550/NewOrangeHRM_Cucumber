package testData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminReadTestData {

	
	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
	// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
	/* ObjectMapper om = new ObjectMapper();
	Root root = om.readValue(myJsonString, Root.class); */
	public static class AddUserData{
	    @JsonProperty("UserName") 
	    public String userName;
	    @JsonProperty("Password") 
	    public String password;
	    @JsonProperty("Emp_Name") 
	    public String emp_Name;
	}

	public static class Root{
	    @JsonProperty("Add_User_Data") 
	    public AddUserData add_User_Data;
	}


}
