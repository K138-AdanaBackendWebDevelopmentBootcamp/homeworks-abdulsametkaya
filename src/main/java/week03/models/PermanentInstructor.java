package week03.models;

import lombok.*;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class PermanentInstructor extends Instructor implements CalculateSalary{
    private int fixedSalary = calculateSalary();

    @Override
    public final int calculateSalary() {
        return 4 * 45 * 150;
    }
}
