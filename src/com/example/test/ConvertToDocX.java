package com.example.test;

public class ConvertToDocX implements ConvertFileInterface{

	@Override
	public void excute(String FileName) {
		System.out.println("file with name = "+ FileName+ " converted to DocX Type");
	}

}
