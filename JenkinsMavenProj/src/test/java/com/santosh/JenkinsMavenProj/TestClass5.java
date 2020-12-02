package com.santosh.JenkinsMavenProj;

import ExcelReader.DataTableExcel;

public class TestClass5 {

	public static void main(String s[])
	{
		DataTableExcel dt= new DataTableExcel("C:\\Users\\chinnu\\git\\JenkinsMavenProject\\JenkinsMavenProj\\src\\test\\java\\TestData\\TestDataExc.xlsx");
	System.out.println(dt.getCellData("Sheet1", "TC01", "uname"));
	System.out.println(dt.getCellData("Sheet1", "TC01", "password"));
	System.out.println(dt.getCellData("Sheet1", "TC02", "uname"));
	System.out.println(dt.getCellData("Sheet1", "TC02", "password"));
	}
}
