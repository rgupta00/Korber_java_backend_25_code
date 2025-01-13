package com.day6.session0.mcq.q2;

import java.io.FileNotFoundException;
import java.io.IOException;

interface xyz {
	void abc() throws IOException;
}

interface pqr {
	void abc() throws FileNotFoundException;
}

class Implementation implements xyz, pqr {
	public void abc() throws FileNotFoundException {
		/* implementation */
	}
}

public class DemoExAndOverriding {

	public static void main(String[] args) {

	}
}
