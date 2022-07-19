package com.ShopForHome.ecommerce.entity;

import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="product_category")

@Getter
@Setter
public class ProductCategory {
	
	private static final String generationType = null;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade= CascadeType.ALL,mappedBy="category")
	private Set<product> products;

}
