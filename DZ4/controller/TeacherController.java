package DZ4.controller;

import DZ4.data.Teacher;
import DZ4.view.TeacherView;
import DZ4.view.UserViewInterface;

public class TeacherController implements IUserController {

    private UserViewInterface userView = new TeacherView();


    @Override
    public void create(String firstName, String secondName) {
        Teacher newTeacher = new Teacher(firstName, secondName);
    }
}