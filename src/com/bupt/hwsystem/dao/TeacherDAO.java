package com.bupt.hwsystem.dao;

import com.bupt.hwsystem.model.Teacher;

import java.util.List;

public interface TeacherDAO {
    void addTeacher(Teacher teacher);
    List<Teacher> listTeacher();
}
