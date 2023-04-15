package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;
import com.example.training_system.pojo.type.RecruitmentAuditStatusEnum;

import java.lang.Integer;
import java.lang.String;


/**
 * 企业招聘表
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_recruitment_audit")
public class RecruitmentAudit {
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	@FieldInfo("学生名称")
	private String studentName;

	@FieldInfo("学生编号")
	private Integer studentNumber;

	@FieldInfo("企业id")
	private Integer enterpriseId;

	@FieldInfo("企业名称")
	private String enterpriseName;

	@FieldInfo("岗位id")
	private Integer recruitId;

	@FieldInfo("岗位名称")
	private String recruitName;

	@FieldInfo(value = "流程状态", basis = RecruitmentAuditStatusEnum.class)
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRecruitName() {
		return recruitName;
	}

	public void setRecruitName(String recruitName) {
		this.recruitName = recruitName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
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

	public Integer getRecruitId() {
		return recruitId;
	}

	public void setRecruitId(Integer recruitId) {
		this.recruitId = recruitId;
	}
}
