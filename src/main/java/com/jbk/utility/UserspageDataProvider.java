package com.jbk.utility;
import java.io.FileInputStream;
import java.util.List;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class UserspageDataProvider {
	
	  @DataProvider
	  public String[][] spanData() throws Exception {
		 FileInputStream fis=new FileInputStream("header1.xls");
		 Workbook wb=Workbook.getWorkbook(fis);
		 Sheet sh=wb.getSheet("spanLabel");
		  int row=sh.getRows();
		  int col=sh.getColumns();
		  String data[][]=new String[col][row];
		  for(int j=0;j<col;j++)
		  {
		  for(int i=0;i<row;i++)
		  {
				 Cell cell=sh.getCell(j, i);
				  data[j][i]=cell.getContents();
			  }
		  }
		  
		  
		return data;
	  }

	  @DataProvider
	  public String[][] headerData() throws Exception {
		  FileInputStream fis=new FileInputStream("header1.xls");
		 Workbook wb=Workbook.getWorkbook(fis);
		 Sheet sh=wb.getSheet("userHeaders");
		  int row=sh.getRows();
		  int col=sh.getColumns();
		  String data[][]=new String[col][row];
		  for(int j=0;j<col;j++)
		  {
		  for(int i=0;i<row;i++)
		  {
				 Cell cell=sh.getCell(j, i);
				  data[j][i]=cell.getContents();
			  }
		  }
		  
		  
		return data;
		
	   
	  }
	  @DataProvider
	  public Object[][] verifyUsers() throws Exception{
			FileInputStream fis =new FileInputStream("header1.xls");
			Workbook wb=Workbook.getWorkbook(fis);
			Sheet sh= wb.getSheet("userData");
			int rows=sh.getRows();
			int cols=sh.getColumns();
			String data[][]=new String[rows][cols];	
			for(int i=1;i<rows;i++) {//rows
				for(int j=0;j<cols;j++) {//cols	
					Cell cell=sh.getCell(j, i);
					data[i][j]=cell.getContents();
				}
			}
	  return  data ;
	}

	  
	
}
