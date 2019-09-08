/**
 * 
 */
package com.tiff.apps.dataaccess.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nitu.verma
 *
 */
@Entity
@Table(name="RESTAURANT_TABLE")
public class RestaurantTable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RESTAURANTID")
	private String restaurantId;
	
	@Column(name="RESTAURANTNAME")
	private String restaurantName;
	
	@Column(name="ADDRESS")
	private String Address;
	
	@Column(name="CREATED")
	private Date registrationDate;
	
	@Column(name="CREATEDBY")
	private String createdBy;
	
	@Column(name="LASTMODIFIED")
	private Date lastModifiedDate;
	
	@Column(name="LASTMODIFIEDBY")
	private String lastModifiedBy;
	
}
