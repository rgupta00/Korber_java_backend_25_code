package com.threads.session1.classical_threads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoEx {

	public static void main(String[] args) {
		try {
			BufferedReader br=
					new BufferedReader(new FileReader("foo.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
