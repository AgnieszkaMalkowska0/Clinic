package Agnieszka.Clinic.repository;

import Agnieszka.Clinic.model.Doctor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Agnieszka on 31.07.2019.
 */
public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
}
