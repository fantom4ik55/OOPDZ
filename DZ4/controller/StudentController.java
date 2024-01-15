package DZ4.controller;

import DZ4.data.Student;
import DZ4.view.StudentView;
import DZ4.view.UserViewInterface;

public class StudentController implements IUserController {

    private UserViewInterface userView = new StudentView();

    @Override
    public void create(String firstName, String secondName) {
        Student newStudent = new Student(firstName, secondName);
    }
}