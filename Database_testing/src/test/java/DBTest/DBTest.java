package DBTest;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Database.Database;

public class DBTest {
	
	WebDriver wd;

	
@Test
 
public void selectDBdata() throws ClassNotFoundException, SQLException{
	
	//String textData=wd.findElement(By.xpath("")).getText();
	String query="Select * from employee";
	
	Database Db=new Database();	
	ResultSet data=Db.getData(query);
	
	System.out.println(data);
	
	while(data.next()){
		System.out.println(data.getString(1)+" "+data.getString(2)+"  "+data.getString(3)+"  "+data.getString(4)+"  "+data.getString(5));
	}
	
	/*
	 if(textData.contains(data.getString(1))){
	 
	 }
	 */
	}
	
 @Test
	
	public void insertDBdata() throws ClassNotFoundException, SQLException{
		
		String query="insert into employee values(6,'clara',18,40000,'clara@gmail.com')";
		
		Database Db=new Database();
		Db.insertData(query);
	}
  
  @Test
	
	public void updateDBdata() throws ClassNotFoundException, SQLException{
		
		String query="update employee set name='shiva' where id=6";
		
		Database Db=new Database();
		Db.updateData(query);
  }
  }
