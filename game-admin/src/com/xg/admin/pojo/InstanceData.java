package com.xg.admin.pojo;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * Generated by the rapid-generator.  DO NOT EDIT!!!
 * 
 * @author zhangyaping email:yapingzhang_beta@163.com
 * @version 1.0, 2014年12月10日
 *
 */
public class InstanceData implements Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
	/**
	 * 副本编号       db_column: F_id 第1个
	 */
	private java.lang.Integer id;
	/**
	 * 副本名称       db_column: F_name 第2个
	 */
	private java.lang.String name;
	/**
	 * 关卡星级（1.普通2.精英3.困难）       db_column: F_rewardgrade 第13个
	 */
	private java.lang.Integer rewardgrade;
	
	private String monsterList;

	public InstanceData() {
	}

	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getRewardgrade() {
		return rewardgrade;
	}

	public void setRewardgrade(java.lang.Integer rewardgrade) {
		this.rewardgrade = rewardgrade;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof InstanceData == false) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		InstanceData other = (InstanceData) obj;
		return new EqualsBuilder().append(getId(), other.getId()).isEquals();
	}

	public String getMonsterList() {
		return monsterList;
	}

	public void setMonsterList(String monsterList) {
		this.monsterList = monsterList;
	}
}