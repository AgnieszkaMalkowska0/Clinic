package Agnieszka.Clinic.repository;

import Agnieszka.Clinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Agnieszka on 31.07.2019.
 */
public interface VisitRepository extends CrudRepository<Visit, Integer> {
}
