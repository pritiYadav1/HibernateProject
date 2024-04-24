package com.pms.productPro;

import java.util.Scanner;

import com.pms.productPro.Dao.Online_Shopping_Dao;
import com.pms.productPro.Model.OnlineShopping;

/**
 * Hello world!
 *
 */
public class App 
{
	Scanner sc=new Scanner(System.in);
    Online_Shopping_Dao Odao=new Online_Shopping_Dao();
    public static void main( String[] args )
    {
        System.out.println( "online store!" );
        App obj=new App();
        obj.my_online_shop();
    }
    
    public void my_online_shop()
    {
    	int choice;
    	System.out.println("Select Your operation:1:save Product\n2:Delete Product\n3:get data by ID");
    	choice=sc.nextInt();    	
    	switch(choice)
    	{
    	case 1:
    		
	    	System.out.println("Enter the product name");
	    	String p_name=sc.nextLine();
	    	System.out.println("Enter product Catagory");
	    	String p_cat=sc.nextLine();
	    	System.out.println("Enter name of brand");
	    	String p_brand=sc.nextLine();
	    	System.out.println("Enter price");
	    	int p_price=sc.nextInt();
	    	System.out.println("Enter Quantity");
	    	int p_qun=sc.nextInt();
	    	System.out.println("Enter the product ID");
	    	int p_id=sc.nextInt();
	    	OnlineShopping product1=new OnlineShopping(p_id,p_name, p_brand, p_cat, p_price, p_qun);
	    	Odao.saveOnline(product1);
	    	break;
    	case 2:
    		System.out.println("Enter the product ID");
	    	int p_id1=sc.nextInt();
	    	Odao.deleteOnline(p_id1);
	    	break;
    	case 3:
    		System.out.println("Enter the product ID");
	    	int p_id2=sc.nextInt();
	    	Odao.getDataById(p_id2);
    		break;
    	case 4:
    		Odao.updateData();
    		break;
    		default:
    			System.out.println("Invalid choice");
    			break;
    	}
    }
}
