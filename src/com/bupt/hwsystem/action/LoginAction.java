package com.bupt.hwsystem.action;

import com.bupt.hwsystem.bo.AdminBo;
import com.bupt.hwsystem.bo.StudentBo;
import com.bupt.hwsystem.bo.TeacherBo;

public class LoginAction {

    StudentBo studentBo;
    TeacherBo teacherBo;
    AdminBo adminBo;
    
    public void setStudentBo(StudentBo studentBo) {
        this.studentBo = studentBo;
    }

    public void setTeacherBo(TeacherBo teacherBo) {
        this.teacherBo = teacherBo;
    }

    public void setAdminBo(AdminBo adminBo) {
        this.adminBo = adminBo;
    }

    public String login(int role, String account, String password){
        String response;
        switch (role){
            case 0://管理员
                response = adminBo.login(account,password);
                break;
            case 1://教师
                response = teacherBo.login(account,password);
                break;
            case 2://学生
                response = studentBo.login(account,password);
                break;
            default:
                response = "Role Error";


        }

        return response;//TODO 根据不同的返回来提醒用户
    }
}
