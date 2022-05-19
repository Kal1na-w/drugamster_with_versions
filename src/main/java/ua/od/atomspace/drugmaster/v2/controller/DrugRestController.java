package ua.od.atomspace.drugmaster.v2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.od.atomspace.drugmaster.v2.model.Drug;
import ua.od.atomspace.drugmaster.v2.service.DrugPurposeService;

@RestController
public class DrugRestController {

    private DrugPurposeService drugPurposeService;

    @Autowired
    public DrugRestController(DrugPurposeService drugPurposeService) {
        this.drugPurposeService = drugPurposeService;
    }

    @RequestMapping(path = "/drugs")
    public Drug findDrugPurpose(@RequestParam String name) {
        return drugPurposeService.findPurpose(name);
    }

}
