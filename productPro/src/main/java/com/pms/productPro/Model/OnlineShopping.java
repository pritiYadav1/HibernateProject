package com.pms.productPro.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Online_shopping")
public class OnlineShopping 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name",length = 30)
	private String p_name;
	
	@Column(name = "product_brand",length = 30)
	private String p_brand;
	
	@Column(name="product_catagory",length=30)
	private String p_category;
	
	@Column(name="product_price",length=10)
	private int p_price;
	
	@Column(name="product_quantity",length=10)
	private int p_qun;
}
