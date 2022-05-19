package ua.od.atomspace.drugmaster.v1.dao;

import ua.od.atomspace.drugmaster.v1.model.Symptom;

import java.util.List;

public interface DrugDao {
    List<Symptom> getDrugPurpose(String drugName);
}
