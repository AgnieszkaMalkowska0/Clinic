package Agnieszka.Clinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Agnieszka on 31.07.2019.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    private Patient patient;

    @OneToOne(cascade = CascadeType.ALL)
    private Doctor doctor;

    private String description;

    @Override
    public String toString() {
        return getDescription();
    }
}
