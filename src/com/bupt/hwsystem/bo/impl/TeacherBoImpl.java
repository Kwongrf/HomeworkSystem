package com.bupt.hwsystem.bo.impl;

import com.bupt.hwsystem.bo.TeacherBo;
import com.bupt.hwsystem.dao.TeacherDAO;
import com.bupt.hwsystem.model.Teacher;

import java.util.List;

public class TeacherBoImpl implements TeacherBo {

    TeacherDAO teacherDAO;// = new TeacherDAOImpl();

    //DI via Spring
    public void setTeacherDAO(TeacherDAO teacherDAO){
        this.teacherDAO = teacherDAO;
    }
    //call DAO to save hwsystem
    @Override
    public void addTeacher(Teacher teacher) {
        teacherDAO.addTeacher(teacher);
    }

    @Override
    public List<Teacher> listTeacher() {
        return teacherDAO.listTeacher();

    }
}
