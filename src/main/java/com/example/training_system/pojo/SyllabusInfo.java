package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;

import java.lang.Integer;
import java.lang.String;

/**
 * 课程信息实体
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_syllabus_info")
public class SyllabusInfo {
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	@FieldInfo("课程名称")
	private String enterpriseName;

	@FieldInfo("课程内容")
	private String courseContent;

	@FieldInfo("企业id")
	private String courseName;

	@FieldInfo("企业名称")
	private Integer enterpriseId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
