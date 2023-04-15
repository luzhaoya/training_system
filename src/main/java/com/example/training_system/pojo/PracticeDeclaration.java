package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;

import java.lang.Integer;
import java.lang.String;

/**
 * 实习申请表
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_practice_declaration")
public class PracticeDeclaration {
	@TableId
	private Integer id;

	@FieldInfo("企业id")
	private Integer enterpriseId;

	@FieldInfo("企业名称")
	private String enterpriseName;

	@FieldInfo("学号")
	private Integer studentNumber;

	@FieldInfo("学生姓名")
	private String studentName;

	@FieldInfo("岗位id")
	private Integer postId;

	@FieldInfo("岗位名称")
	private String postName;

	@FieldInfo("实习审核状态")
	private String checkStatus;

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

	public String getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
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
