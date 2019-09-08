/**
 * 
 */
package com.tiff.apps.dataaccess.jpa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nitu.verma
 *
 */
@Entity
@Table(name = "SUBSCRIPTION_TABLE")
public class Subscription implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SUBSCRIPTIONID")
	private String subscriptionId;
	
	@Column(name="USERID")
	private String UserId;
	
	@Column(name="SUBSCRIPTIONDATE")
	private Date SubscriptionDate;
	
	@Column(name="EXPIRYDATE")
	private Date expiryDate;
	
	@Column(name="SUBSCRIPTIONTYPE")
	private String subscriptionType;
	
	@Column(name="STATENAME")
	private String subscriptionState;
	
	@Column(name="STATEREASON")
	private String stateReason;
	
	@Column(name="FOODTYPEID")
	private String foodTypeId;
	
	@Column(name="LASTMODIFIED")
	private Date lastModified;

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public Date getSubscriptionDate() {
		return SubscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		SubscriptionDate = subscriptionDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public String getSubscriptionState() {
		return subscriptionState;
	}

	public void setSubscriptionState(String subscriptionState) {
		this.subscriptionState = subscriptionState;
	}

	public String getStateReason() {
		return stateReason;
	}

	public void setStateReason(String stateReason) {
		this.stateReason = stateReason;
	}

	public String getFoodTypeId() {
		return foodTypeId;
	}

	public void setFoodTypeId(String foodTypeId) {
		this.foodTypeId = foodTypeId;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SubscriptionDate == null) ? 0 : SubscriptionDate.hashCode());
		result = prime * result + ((UserId == null) ? 0 : UserId.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((foodTypeId == null) ? 0 : foodTypeId.hashCode());
		result = prime * result + ((lastModified == null) ? 0 : lastModified.hashCode());
		result = prime * result + ((stateReason == null) ? 0 : stateReason.hashCode());
		result = prime * result + ((subscriptionId == null) ? 0 : subscriptionId.hashCode());
		result = prime * result + ((subscriptionState == null) ? 0 : subscriptionState.hashCode());
		result = prime * result + ((subscriptionType == null) ? 0 : subscriptionType.hashCode());
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
		Subscription other = (Subscription) obj;
		if (SubscriptionDate == null) {
			if (other.SubscriptionDate != null)
				return false;
		} else if (!SubscriptionDate.equals(other.SubscriptionDate))
			return false;
		if (UserId == null) {
			if (other.UserId != null)
				return false;
		} else if (!UserId.equals(other.UserId))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (foodTypeId == null) {
			if (other.foodTypeId != null)
				return false;
		} else if (!foodTypeId.equals(other.foodTypeId))
			return false;
		if (lastModified == null) {
			if (other.lastModified != null)
				return false;
		} else if (!lastModified.equals(other.lastModified))
			return false;
		if (stateReason == null) {
			if (other.stateReason != null)
				return false;
		} else if (!stateReason.equals(other.stateReason))
			return false;
		if (subscriptionId == null) {
			if (other.subscriptionId != null)
				return false;
		} else if (!subscriptionId.equals(other.subscriptionId))
			return false;
		if (subscriptionState == null) {
			if (other.subscriptionState != null)
				return false;
		} else if (!subscriptionState.equals(other.subscriptionState))
			return false;
		if (subscriptionType == null) {
			if (other.subscriptionType != null)
				return false;
		} else if (!subscriptionType.equals(other.subscriptionType))
			return false;
		return true;
	}
	
	
}
