package com.bupt.hwsystem.action;

import com.bupt.hwsystem.bo.StudentBo;
import com.bupt.hwsystem.bo.impl.StudentBoImpl;
import com.bupt.hwsystem.model.Student;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Date;

public class StudentAction implements ModelDriven {
    Student student = new Student();
    StudentBo studentBo;

    @Override
    public Object getModel() {
        return student;
    }



    public void setStudentBo(StudentBoImpl studentBo) {
        this.studentBo = studentBo;
    }

    public String addStudent() throws Exception {
        studentBo.addStudent(student);
        return "success";
    }


    public void setStudentName(String studentName) {
        this.student.setStudentName(studentName);
    }

    public void setStudentId(String studentId) {
        this.student.setStudentId(studentId);
    }


    public void setClassId(String classId) {
        this.student.setClassId(classId);
    }

    public void setSex(String sex) {
        this.student.setSex(sex);
    }

    public void setEmail(String email) {
        this.student.setEmail(email);
    }

    public void setPassword(String password) {
        this.student.setPassword(password);
    }

    public void setEntranceDate(Date date){
        this.student.setEntranceDate(date);
    }
}
