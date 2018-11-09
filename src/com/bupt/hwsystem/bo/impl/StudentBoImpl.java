package com.bupt.hwsystem.bo.impl;

import com.bupt.hwsystem.bo.StudentBo;
import com.bupt.hwsystem.dao.StudentDAO;
import com.bupt.hwsystem.model.Student;

public class StudentBoImpl implements StudentBo {
    StudentDAO studentDAO;

    public StudentDAO getStudentDAO() {
        return studentDAO;
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }
}
