package ua.od.atomspace.drugmaster.v2.dao;

import ua.od.atomspace.drugmaster.v2.model.Symptom;

import java.util.List;

public interface DrugDao {
    List<Symptom> getDrugPurpose(String drugName);
}
