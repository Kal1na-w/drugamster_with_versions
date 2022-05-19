package ua.od.atomspace.drugmaster.v3.service;

import ua.od.atomspace.drugmaster.v3.model.Drug;

public interface DrugPurposeService {
    Drug findPurpose(String drugName);

    Drug createDrug(Drug drug);

    Drug updateDrug(Drug drug);
}
