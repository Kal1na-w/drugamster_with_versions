package ua.od.atomspace.drugmaster.v3.dao.repo;

import ua.od.atomspace.drugmaster.v3.model.Drug;
import ua.od.atomspace.drugmaster.v3.model.Symptom;

import java.util.List;

public interface DrugRepository {
    List<Symptom> findPurposeByName(String name);

    Drug addDrug(Drug drug);

    Drug updateDrug(Drug drug);

    void deleteDrug(Drug drug);
}
