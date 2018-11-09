package com.bupt.hwsystem.bo;

import com.bupt.hwsystem.model.Teacher;

import java.util.List;

public interface TeacherBo {

    void addTeacher(Teacher teacher);
    List<Teacher> listTeacher();
}
