package Agnieszka.Clinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 31.07.2019.
 */

@Data
@NoArgsConstructor
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "patient")
    private List<Visit> visitList = new ArrayList<>();

//    @JoinTable(name = "visit")
//    @JoinColumn(name = "doctor_id")
//    @OneToMany
//    private List<Doctor> doctors = new ArrayList<>();

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return getName();
    }
}
