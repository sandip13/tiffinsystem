/**
 * 
 */
package com.tiff.apps.dataaccess.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nitu.verma
 *
 */
@Entity
@Table(name="FOODTYPE")
public class FoodType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1640893512505103925L;

	@Id
	@Column(name="FOODTYPEID")
	private String foodTypeId;
	
	@Column(name="FOODTYPENAME")
	private String foodTypeName;

	public String getFoodTypeId() {
		return foodTypeId;
	}

	public void setFoodTypeId(String foodTypeId) {
		this.foodTypeId = foodTypeId;
	}

	public String getFoodTypeName() {
		return foodTypeName;
	}

	public void setFoodTypeName(String foodTypeName) {
		this.foodTypeName = foodTypeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foodTypeId == null) ? 0 : foodTypeId.hashCode());
		result = prime * result + ((foodTypeName == null) ? 0 : foodTypeName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodType other = (FoodType) obj;
		if (foodTypeId == null) {
			if (other.foodTypeId != null)
				return false;
		} else if (!foodTypeId.equals(other.foodTypeId))
			return false;
		if (foodTypeName == null) {
			if (other.foodTypeName != null)
				return false;
		} else if (!foodTypeName.equals(other.foodTypeName))
			return false;
		return true;
	}
	
}
