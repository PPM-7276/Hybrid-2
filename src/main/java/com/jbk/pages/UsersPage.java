package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.objectRepository.UserRepository;


public class UsersPage extends UserRepository {
	int i=1;
    int rowNum=2;
	 WebDriver driver;
	 
	 public UsersPage(WebDriver driver){
		 PageFactory.initElements(driver, this);
	 }
	 
	 public boolean checkTitle(WebDriver driver) throws InterruptedException {
			String title = driver.getTitle();
			//System.out.println(Title);
			if(title.equals("JavaByKiran | User")){
				return true;
			}
			return false;			
		}
	 
	 public boolean checkUsesrPage(WebDriver driver) throws InterruptedException {
		  
			String title=driver.getCurrentUrl();
		    if(title.equals("file:///D:/Offline%20website/Offline%20website/pages/examples/users.html")){
				
				return true;
				
			}
			return false;	
		}
	 
	 
	
	public boolean isCopyRightTextValid(WebDriver driver)
		{    
			
			if(textCopyright.getText().equals("Copyright © 2005-2019 JavaByKiran.")){
				return true;
			}
			else{
				return false;
			}
		}
	 

	public boolean isDesignForTextValid(WebDriver driver)
		{
			if(textDesignedForSelenium.getText().equals("Design for Selenium Automation Test V 2.3.0"))
				return true;
			
			else{
				return false;
			}
		}
		
	
		public boolean checkAddUserbtn() throws InterruptedException
		{
		   // addButton.click();
			WebElement addbutton=addButton;
			if(addbutton.isEnabled()){
				return true;
				
			}	else{
					return false;
				}
		}
		
			public boolean checkJavaByKiranLink(WebDriver driver) throws InterruptedException
			{
				WebElement linkClick=link;
				if(linkClick.equals("https://javabykiran.com/")){
				     return true;
				     
			}   else {
					return false;
				}
				
}
			
			public boolean checkHomeLinkUserPage(WebDriver driver)
			{
				
				WebElement urlcheck=url;
				if(urlcheck.equals("file:///D:/Offline%20website/Offline%20website/pages/examples/users.html#")){
				     return true;
				     
			}   else {
					return false;
				}
				
			}	
			
			public boolean checkHeaderCount (WebDriver driver){
				ArrayList<String> actualHeaders=new ArrayList<String>();
				List<WebElement> headerList=(List<WebElement>) header;
				for (WebElement wb : headerList){
					
					actualHeaders.add(wb.getText());
				}
				if(headerList.size() == 8){
					 return true;
				     
				}   else {
						return false;
					}
			}
				public boolean checkTableHeading() throws InterruptedException {
					ArrayList<String> exptblHd=new ArrayList<String>();
					exptblHd.add("#");
					exptblHd.add("Username");
					exptblHd.add("Email");
					exptblHd.add("Mobile");
					exptblHd.add("Course");
					exptblHd.add("Gender");
					exptblHd.add("State");
					exptblHd.add("Action");
			
					
					List<WebElement> listElement= hd;
					ArrayList<String> acttblHd=new ArrayList<String>();
					for(WebElement we: listElement)
					{
					acttblHd.add(we.getText());	
					}
					if(acttblHd.equals(exptblHd)) {
						return true;
					}else {
						return false;
					}
						}
				
				public boolean buttonIsClickable() {
					WebElement button = buttonIsClickable;
					boolean actcheck = button.isEnabled();
					System.out.println(">>>" + actcheck);
					if(button.isEnabled()) {
						return true;
					}else {
						return false;
					}
				}

				
				public boolean logoutButtonWorking() {
					WebElement button = logoutButton;
					button.click();
					String actTitle=driver.getTitle();
					String ExpTitle="JavaByKiran | Log in";
					if(actTitle.equals(ExpTitle)) {
						return true;
					}else {
						return false;
					}
				}
				 @Test
				  public boolean checkNoOfDeleteButtons()
				  {
					  List<WebElement> listOfButton=deleteButtonNo;
					  int deleteButtons=listOfButton.size();
					  System.out.println("No Of Delete Buttons="+deleteButtons);
					  
					  if(listOfButton.equals(deleteButtons)) {
							return true;
						}else {
							return false;
						}
							
				  }
				  
				  
				  @Test
				  public boolean checkNoOfRows()
				  {
					  List<WebElement> listOfRows= noOfRows;
					  int countOfRows=listOfRows.size();
					  //System.out.println(listOfRows);
					  System.out.println("No Of Rows="+countOfRows);
					  
					  if(listOfRows.equals(countOfRows)) {
							return true;
						}else {
							return false;
						}
				  }
					
	
			
			 public boolean checkEmailSuffix(WebDriver driver){
						// ArrayList<String> explistOfEmail=new ArrayList<>();
						  List<WebElement> actlistOfEmail=emailColumn;
						  for(WebElement webelement: actlistOfEmail){
							  String emailSuffix=webelement.getText();
							  if(emailSuffix.contains("@gmail.com"))
							  {
								  System.out.println("Email return true"+emailSuffix);
								  return true;
								  
							  }
							  else
							  {
								  System.out.println("Email return False"+emailSuffix);
								  return false;
							  }

							  
						  }
						  		
						  System.out.println("Size of colunm="+actlistOfEmail.size());
						return true;
					  }
					  
			 
			  public boolean verifyHeader(String expHeader)  throws Exception {
				  List<WebElement> actHeaders= driver.findElements(By.tagName("th"));
					if(i<actHeaders.size()){
					String actHeader=actHeaders.get(i).getText();
					i++;
					System.out.println(actHeader+"  "+expHeader);
					
					}
					//driver.close();
					if(actHeaders.equals(expHeader)) {
						return true;
					}else {
						return false;
					}
					
			  }
			  
			  public boolean verifyUserData(String srNum, String name, String email, String mobile, 
					  String course , String gender , String state) { 
				  List<String> expValue = new ArrayList<String>();
				  expValue.add(srNum);//0
				  expValue.add(name);//1
				  expValue.add(email);//2
				  expValue.add(mobile);//3
				  expValue.add(course);//4
				  expValue.add(gender);//5
				  expValue.add(state);//6
				 // expValue.add(action);//7
				  
				  List<WebElement> rowData= driver.findElements(By.xpath("//tr["+rowNum+"]/td"));
				  if(i<rowData.size()-1) {
						String actValue=rowData.get(i).getText();		
						System.out.println(actValue+"    "+expValue.get(i));
					
						i++;
						
					if(actValue.equals(expValue)) {
						return true;
					}
				  }
					
				  rowNum++;
				return false;
			  }
	


}
			
			

