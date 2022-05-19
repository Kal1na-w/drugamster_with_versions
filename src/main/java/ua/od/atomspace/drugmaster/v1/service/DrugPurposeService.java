package ua.od.atomspace.drugmaster.v1.service;

import ua.od.atomspace.drugmaster.v1.model.Drug;

public interface DrugPurposeService {
    Drug findPurpose(String drugName);

}
