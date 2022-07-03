package week01;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Address address1 = new Address("papatya mah","74/3","Basaksehir","Istanbul");

        Course mat = new Course("Matematik",101,4);

        List<Course> list1 = new ArrayList<>();
        list1.add(mat);

        Instructor int1 = new PermanentInstructor("samet",address1,"234153431",list1);

        System.out.println(int1);

        //örnek olarak bir instructor oluşturulmuştur.

    }

}
