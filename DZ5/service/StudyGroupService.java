package DZ5.service;


import DZ5.model.Student;
import DZ5.model.StudyGroup;
import DZ5.model.Teacher;

import java.util.List;

public class StudyGroupService {

    private StudyGroup studyGroup;

    public void createStudyGroup(List<Student> students, Teacher teacher) {
        this.studyGroup = new StudyGroup(teacher, students);
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
}