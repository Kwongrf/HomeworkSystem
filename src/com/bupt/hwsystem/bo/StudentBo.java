package com.bupt.hwsystem.bo;

import com.bupt.hwsystem.model.Student;

public interface StudentBo {
    public void addStudent(Student student);

    String login(String account, String password);
}
