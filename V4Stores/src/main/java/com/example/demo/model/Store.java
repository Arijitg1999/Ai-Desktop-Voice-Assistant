package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer permitionId;
	
	@Column(name = "permission_name")
	private String permissionName;
	@Column(name = "permission_description")
	private String permissionDescription;
	@Column(name = "permission_group")
	private String permissionGroup;
	@Column(name = "permission_control")
	private String permissionControl;
	@Column(name = "icon")
	private String icon;
	@Column(name = "permission_level")
	private String permissionLevel;
	@Column(name = "rank_data")
	private Integer rankData;
	
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Store(Integer permitionId, String permissionName, String permissionDescription, String permissionGroup,
			String permissionControl, String icon, String permissionLevel, Integer rankData) {
		super();
		this.permitionId = permitionId;
		this.permissionName = permissionName;
		this.permissionDescription = permissionDescription;
		this.permissionGroup = permissionGroup;
		this.permissionControl = permissionControl;
		this.icon = icon;
		this.permissionLevel = permissionLevel;
		this.rankData = rankData;
	}
	@Override
	public String toString() {
		return "Store [permitionId=" + permitionId + ", permissionName=" + permissionName + ", permissionDescription="
				+ permissionDescription + ", permissionGroup=" + permissionGroup + ", permissionControl="
				+ permissionControl + ", icon=" + icon + ", permissionLevel=" + permissionLevel + ", rankData="
				+ rankData + "]";
	}
	public Integer getPermitionId() {
		return permitionId;
	}
	public void setPermitionId(Integer permitionId) {
		this.permitionId = permitionId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionDescription() {
		return permissionDescription;
	}
	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
	}
	public String getPermissionGroup() {
		return permissionGroup;
	}
	public void setPermissionGroup(String permissionGroup) {
		this.permissionGroup = permissionGroup;
	}
	public String getPermissionControl() {
		return permissionControl;
	}
	public void setPermissionControl(String permissionControl) {
		this.permissionControl = permissionControl;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getPermissionLevel() {
		return permissionLevel;
	}
	public void setPermissionLevel(String permissionLevel) {
		this.permissionLevel = permissionLevel;
	}
	public Integer getRankData() {
		return rankData;
	}
	public void setRankData(Integer rankData) {
		this.rankData = rankData;
	}
	
	
	
	
}