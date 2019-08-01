package Agnieszka.Clinic.repository;

import Agnieszka.Clinic.model.Patient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Agnieszka on 31.07.2019.
 */
public interface PatientRepository extends CrudRepository<Patient, Integer> {
}
