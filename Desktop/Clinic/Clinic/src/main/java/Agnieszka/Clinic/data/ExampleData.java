package Agnieszka.Clinic.data;

import Agnieszka.Clinic.model.Doctor;
import Agnieszka.Clinic.model.Patient;
import Agnieszka.Clinic.repository.DoctorRepository;
import Agnieszka.Clinic.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Agnieszka on 31.07.2019.
 */
@Component
public class ExampleData  implements CommandLineRunner{

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;


    @Override
    public void run(String... strings) throws Exception {

        if (doctorRepository.count() ==0)  {

            doctorRepository.save(new Doctor(1, "Adam Nowak"));
            doctorRepository.save(new Doctor(2, "Jan Kowalski"));
            doctorRepository.save(new Doctor(3, "Edward Kania"));
            doctorRepository.save(new Doctor(4, "Alicja Słowińska"));
        }

        if(patientRepository.count()==0) {

            patientRepository.save(new Patient(1, "Marta Skalska"));
            patientRepository.save(new Patient(2, "Michał Sokołowski"));
            patientRepository.save(new Patient(3, "Dariusz Pałęta"));
            patientRepository.save(new Patient(4, "Roman Pawlik"));
        }
    }
}
