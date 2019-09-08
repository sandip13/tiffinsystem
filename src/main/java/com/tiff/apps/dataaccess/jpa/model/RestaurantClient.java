/**
 * 
 */
package com.tiff.apps.dataaccess.jpa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author nitu.verma
 *
 */

@Entity
@Table(name="RESTAURANT_CLIENT_TABLE")
public class RestaurantClient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5427314122400644567L;
	private String clientId;
	private String clientName;
	private String cleintEmailId;
	private String clientPhoneNumber;
	private String password;
	private Date createdOn;
	private String clientAddress;
	private String roleId;
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getCleintEmailId() {
		return cleintEmailId;
	}
	public void setCleintEmailId(String cleintEmailId) {
		this.cleintEmailId = cleintEmailId;
	}
	public String getClientPhoneNumber() {
		return clientPhoneNumber;
	}
	public void setClientPhoneNumber(String clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cleintEmailId == null) ? 0 : cleintEmailId.hashCode());
		result = prime * result + ((clientAddress == null) ? 0 : clientAddress.hashCode());
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + ((clientPhoneNumber == null) ? 0 : clientPhoneNumber.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
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
		RestaurantClient other = (RestaurantClient) obj;
		if (cleintEmailId == null) {
			if (other.cleintEmailId != null)
				return false;
		} else if (!cleintEmailId.equals(other.cleintEmailId))
			return false;
		if (clientAddress == null) {
			if (other.clientAddress != null)
				return false;
		} else if (!clientAddress.equals(other.clientAddress))
			return false;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (clientPhoneNumber == null) {
			if (other.clientPhoneNumber != null)
				return false;
		} else if (!clientPhoneNumber.equals(other.clientPhoneNumber))
			return false;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		return true;
	}
	
}
