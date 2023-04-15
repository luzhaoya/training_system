package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;

import java.lang.Integer;
import java.lang.String;

/**
 * 学生信息
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_student_information")
public class StudentInformation {
	@TableId(value = "student_number")
	private String studentNumber;

	@FieldInfo("学生姓名")
	private String name;

	@FieldInfo("学生年龄")
	private Integer age;

	@FieldInfo("联系电话")
	private String telephone;

	@FieldInfo("性别")
	private String sex;

	@FieldInfo("学院")
	private String college;

	@FieldInfo("特长")
	private String projectExperience;

	@FieldInfo("项目经历")
	private String selfIntroduction;

	@FieldInfo("自我介绍")
	private String strongPoint;

	@FieldInfo("专业")
	private String major;

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getProjectExperience() {
		return projectExperience;
	}

	public void setProjectExperience(String projectExperience) {
		this.projectExperience = projectExperience;
	}

	public String getSelfIntroduction() {
		return selfIntroduction;
	}

	public void setSelfIntroduction(String selfIntroduction) {
		this.selfIntroduction = selfIntroduction;
	}

	public String getStrongPoint() {
		return strongPoint;
	}

	public void setStrongPoint(String strongPoint) {
		this.strongPoint = strongPoint;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
