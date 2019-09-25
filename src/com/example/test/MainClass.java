package com.example.test;

public class MainClass {

	public static String FileName="test.txt";
	public static void main(String[] args) {
		ConvertFileInterface DocX=new ConvertToDocX();
		ConvertFileInterface PDF=new ConvertToPdf();

		ConvertFile convertFileDocType=new ConvertFile(DocX,FileName);
		ConvertFile convertFilePDFType=new ConvertFile(PDF,FileName);

		convertFileDocType.DoConvert();
		convertFilePDFType.DoConvert();
	}

}
