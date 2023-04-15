package com.example.training_system.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.training_system.annotate.FieldInfo;

import java.lang.Integer;

/**
 * 选课实体
 * @author luzhao
 * @date 2023/04/15
 */
@TableName("t_opt_syllabus")
public class OptSyllabus {
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	@FieldInfo("课程id")
	private Integer courseId;

	@FieldInfo("学生学号")
	private Integer studentNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}
}
