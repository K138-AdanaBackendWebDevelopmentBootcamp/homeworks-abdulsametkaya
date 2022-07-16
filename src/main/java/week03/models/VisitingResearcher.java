package week03.models;

import lombok.*;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class VisitingResearcher extends Instructor implements CalculateSalary {
    private int hourlySalary = calculateSalary();

    @Override
    public final int calculateSalary() {
        return 4 * 20 * 140;
    }
}
