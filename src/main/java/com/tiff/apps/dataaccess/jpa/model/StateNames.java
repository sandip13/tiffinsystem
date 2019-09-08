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
@Table(name="STATE")
public class StateNames implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3053721663545454822L;
	/**
	 * 
	 */	
	@Id
	@Column(name="STATENAME")
	private String stateName;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
}
