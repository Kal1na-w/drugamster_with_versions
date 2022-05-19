package ua.od.atomspace.drugmaster.v2.dao.repo;

import ua.od.atomspace.drugmaster.v2.model.Symptom;

import java.util.List;

public interface DrugRepository {
    List<Symptom> findPurposeByName(String name);
}
