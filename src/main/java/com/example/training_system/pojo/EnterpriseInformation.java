package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;

import java.lang.Integer;
import java.lang.String;

/**
 * 企业信息
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_enterprise_information")
public class EnterpriseInformation {
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	@FieldInfo("企业名称")
	private String name;

	@FieldInfo("企业地址")
	private String address;

	@FieldInfo("联系电话")
	private String contactNumber;

	@FieldInfo("企业规模")
	private String scale;

	@FieldInfo("主营业务")
	private String mainBusiness;

	@FieldInfo("法人代表")
	private String corporateRepresentative;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainBusiness() {
		return mainBusiness;
	}

	public void setMainBusiness(String mainBusiness) {
		this.mainBusiness = mainBusiness;
	}


	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCorporateRepresentative() {
		return corporateRepresentative;
	}

	public void setCorporateRepresentative(String corporateRepresentative) {
		this.corporateRepresentative = corporateRepresentative;
	}
}
