package week02.client;

import week02.controller.CourseController;
import week02.models.Course;
import week02.models.Instructor;
import week02.models.PermanentInstructor;
import week02.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

    CourseController coursesController = new CourseController();

        Instructor ins1 = new PermanentInstructor();

    Course course1 = new Course("Math","101",4,ins1);
        coursesController.saveCourse(course1);
}

    private static int checkData() {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        return em.createQuery("from Course ", Course.class).getResultList().size();
    }
}
