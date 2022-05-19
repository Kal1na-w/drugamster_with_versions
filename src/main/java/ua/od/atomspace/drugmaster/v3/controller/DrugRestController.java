package ua.od.atomspace.drugmaster.v3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.od.atomspace.drugmaster.v3.model.Drug;
import ua.od.atomspace.drugmaster.v3.service.DrugPurposeService;

@RestController
public class DrugRestController {

    private DrugPurposeService drugPurposeService;

    @Autowired
    public DrugRestController(DrugPurposeService drugPurposeService) {
        this.drugPurposeService = drugPurposeService;
    }

    @PostMapping
    public Drug createDrug(@RequestBody Drug drug) {
        return drugPurposeService.createDrug(drug);
    }

    @GetMapping("/drugs")
    public Drug readDrug(@RequestParam String name) {
        return drugPurposeService.findPurpose(name);
    }

    @PutMapping
    public Drug updateDrug(@RequestBody Drug drug) {
        return drugPurposeService.updateDrug(drug);
    }


}
