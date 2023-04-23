package com.nour.university.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nour.university.entities.University;
import com.nour.university.service.UniversityService;
@RestController
@RequestMapping("/api")
@CrossOrigin



public class UniversityRESTController {

@Autowired
UniversityService UniversityService;
@RequestMapping(method = RequestMethod.GET)
public List<University> getAllUniversities() {
return UniversityService.getAllUniversity();
}
}



