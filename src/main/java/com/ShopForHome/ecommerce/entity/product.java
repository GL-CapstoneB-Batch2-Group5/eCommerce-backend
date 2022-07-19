package com.ShopForHome.ecommerce.entity;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name="product")
@Data
public class product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable= false)
	private ProductCategory category;
	
	@Column(name= "sku")
	private String sku;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "description")
	private String description;
	
	@Column(name= "unit_Price")
	private BigDecimal unitPrice;
	
	@Column(name= "image_url")
	private String imageurl;
	
	@Column(name= "active")
	private Boolean active;
	
	@Column(name= "units_in_Stock")
	private int unitsInstock;
	
	@Column(name= "date_Created")
	@CreationTimestamp
	private Date dateCreated;
	
	@Column(name= "last_Update")
	@UpdateTimestamp
	private Date lastUpdated;

}
