package com.example.test;

public class ConvertFile {
	
	private ConvertFileInterface GenericWay;
	private String FileName;
	public ConvertFile(ConvertFileInterface GenericWay,String fileName) {
		this.GenericWay=GenericWay;
		this.FileName=fileName;
	}
	
	public Boolean DoConvert() {
		GenericWay.excute(FileName);
		return true;
	}

}
