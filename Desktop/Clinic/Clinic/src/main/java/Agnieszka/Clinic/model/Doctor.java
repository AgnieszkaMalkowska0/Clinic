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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "doctor")
    private List<Visit> visits =new ArrayList<>();

    public Doctor(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return getName();
    }

    //   private List<Patient> patients = new ArrayList<>();


}
