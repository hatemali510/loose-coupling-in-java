package com.example.test;

public class ConvertToPdf implements ConvertFileInterface{

	@Override
	public void excute(String FileName) {
		System.out.println("file with name = "+ FileName+ " converted to PDF Type");
	}

}
