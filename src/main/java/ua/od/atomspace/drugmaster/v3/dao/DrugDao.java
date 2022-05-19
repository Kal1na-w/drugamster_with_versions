package ua.od.atomspace.drugmaster.v3.dao;

import ua.od.atomspace.drugmaster.v3.model.Drug;
import ua.od.atomspace.drugmaster.v3.model.Symptom;

import java.util.List;

public interface DrugDao {
    List<Symptom> getDrugPurpose(String drugName);

    Drug createDrug(Drug drug);

    Drug updateDrug(Drug drug);
}
