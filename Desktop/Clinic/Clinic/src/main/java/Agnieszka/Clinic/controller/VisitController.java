package Agnieszka.Clinic.controller;

import Agnieszka.Clinic.model.Doctor;
import Agnieszka.Clinic.model.Visit;
import Agnieszka.Clinic.repository.DoctorRepository;
import Agnieszka.Clinic.repository.PatientRepository;
import Agnieszka.Clinic.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Agnieszka on 31.07.2019.
 */
@Controller
public class VisitController {

    @Autowired
    private VisitRepository visitRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/")
    public String home(ModelMap map) {
        map.put("visits", visitRepository.findAll());
        map.put("visit", new Visit());
        map.put("doctors", doctorRepository.findAll());
        map.put("patients", patientRepository.findAll());
        return "home";
    }


    @PostMapping("/arrange")
    public String create(@ModelAttribute Visit visit, ModelMap map) {
        map.put("visit",visit);
        visitRepository.save(visit);
        return "arranged";
    }

   /* @GetMapping("/{name}")
    public String showDescription(@PathVariable String name, ModelMap map) {
        Doctor doctor = doctorRepository.findByName().get()
    }*/




}
