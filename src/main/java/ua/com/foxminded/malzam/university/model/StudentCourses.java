package ua.com.foxminded.malzam.university.model;

import java.util.Objects;

public class StudentCourses {
    private final int studentId;
    private final int courseId;

    public StudentCourses(int studentId, int courseId) { //DataTableGenerator.generateStudentsAndCourses
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public int getStudentId() { //DataTableLoader
        return studentId;
    }

    public int getCourseId() { //DataTableLoader
        return courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentCourses other = (StudentCourses) obj;
        return courseId == other.courseId && studentId == other.studentId;
    }

    @Override
    public String toString() {
        return "StudentAndCourse [studentId=" + studentId + ", courseId=" + courseId + "]";
    }
}
