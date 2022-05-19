package ua.od.atomspace.drugmaster.v2.service;

import ua.od.atomspace.drugmaster.v2.model.Drug;

public interface DrugPurposeService {
    Drug findPurpose(String drugName);

}
