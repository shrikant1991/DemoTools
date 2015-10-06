package com.axway.shri.in;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonEncodeDemo {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("Novel Name", "Godaan");
		obj.put("Author", "Munshi Premchand");
		obj.put("Reader", "Shrikant Gupta");

		JSONArray novelDetails  = new JSONArray();
		novelDetails.add("Language: Hindi");
		novelDetails.add("Year of Publication: 1936");
		novelDetails.add("Publisher: Lokmanya Press");

		obj.put("Novel Details:: ",novelDetails);
		System.out.println(obj);

	}
}
