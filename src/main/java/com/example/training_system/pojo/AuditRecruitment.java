package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;
import com.example.training_system.pojo.type.AuditRecruitmentCheckEnum;

import java.lang.Integer;
import java.lang.String;

/**
 * 招聘信息审核实体
 *
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_audit_recruitment")
public class AuditRecruitment {

	@TableId
	private Integer id;

	@FieldInfo("企业id")
	private Integer enterpriseId;

	@FieldInfo("企业名称")
	private String enterpriseName;

	@FieldInfo("岗位id")
	private Integer postId;

	@FieldInfo("岗位名称")
	private String postName;

	@FieldInfo(value = "审核状态", basis = AuditRecruitmentCheckEnum.class)
	private String checkStatus;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public Integer getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(Integer enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
}
