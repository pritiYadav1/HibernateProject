package com.pms.productPro.Dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pms.productPro.Model.OnlineShopping;
import com.pms.productPro.Utility.HibernateUtil;

public class Online_Shopping_Dao 
{
	public void saveOnline(OnlineShopping onlineShopping )
	{
		Transaction transcation=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transcation=session.beginTransaction();
			session.save(onlineShopping);
			transcation.commit();
			
		}
		catch (Exception e) {
			if(transcation!=null)
			{
				transcation.rollback();
			}
		}
	
	}
	
	
	public void deleteOnline(int id)
	{
		Transaction transcation=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transcation=session.beginTransaction();
			OnlineShopping onlineShopping=session.get(OnlineShopping.class, id);
			session.delete(onlineShopping);
			System.out.println("Product Id "+id+" is deleted successfully");
			transcation.commit();
			
		}
		catch (Exception e) {
			
			System.out.println("Data not found with id:"+id);
		}
		
	}
	public void getDataById(int id)
	{
		Transaction transcation=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			transcation=session.beginTransaction();
			OnlineShopping onlineShopping=session.get(OnlineShopping.class, id);
			if(onlineShopping!=null)
			{
				System.out.println("Product Name:"+onlineShopping.getP_name());
				System.out.println("Product Catagory:"+onlineShopping.getP_category());
				System.out.println("Product Brand:"+onlineShopping.getP_brand());
				System.out.println("Product Price:"+onlineShopping.getP_price());
				System.out.println("Product Quantity:"+onlineShopping.getP_qun());
			}
			else
			{
				System.out.println("Data not found of id:"+id);
			}
			
			transcation.commit();
			
		}
		catch (Exception e) 
		{	
			System.out.println("Error in fetching the data ");
			if(transcation!=null)
			{
				transcation.rollback();
			}
		}
	}
	public void updateData()
	{
		Transaction transcation=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			Scanner sc=new Scanner(System.in);
			transcation=session.beginTransaction();
			System.out.println("Enter producID.");
			int p_no=sc.nextInt();
			
			OnlineShopping onlineShopping=session.get(OnlineShopping.class,p_no);
			if(onlineShopping!=null)
			{
				System.out.println("enter the column no you want to update");
				System.out.println("1:name\n2:category\n3:brand\n4:price\n5:Quantity");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter the new product name:");
					onlineShopping.setP_name(sc.next());
					break;
				case 2:
					System.out.println("Enter the new category name:");
					onlineShopping.setP_category(sc.next());
					break;

				case 3:
					System.out.println("Enter the new brand name:");
					onlineShopping.setP_brand(sc.next());
					break;

				case 4:
					System.out.println("Enter the new price:");
					onlineShopping.setP_price(sc.nextInt());
					break;

				case 5:
					System.out.println("Enter the new product Quantity:");
					onlineShopping.setP_qun(sc.nextInt());
					break;
				default:
						System.out.println("invalid choice");
						break;
				}
				
				session.save(onlineShopping);
				transcation.commit();
			}
			else
			{
				System.out.println("product id not found "+p_no);
			}
			
			
		}
		catch (Exception e) {
			if(transcation!=null)
			{
				transcation.rollback();
			}
		}
		
	}
	
	
}
