package com.property;

import java.io.IOException;

public class Reader {
	public Reader() {

	}
	
	public static Configuration getInstance() throws IOException {
		Configuration c= new Configuration();
		return c;
	}

}
