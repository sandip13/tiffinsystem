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
@Table(name="ROLE")
public class RoleName implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8079535621172842059L;
	
	@Id
	@Column(name="ROLEID")
	private String roleId;

	@Column(name="ROLENAME")
	private String roleName;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
