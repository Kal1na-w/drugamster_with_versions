package ua.od.atomspace.drugmaster.v3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.od.atomspace.drugmaster.v3.dao.repo.DrugRepository;
import ua.od.atomspace.drugmaster.v3.model.Drug;
import ua.od.atomspace.drugmaster.v3.model.Symptom;

import java.util.List;

@Component
public class DrugDaoInMemory implements DrugDao {

    private DrugRepository drugRepository;

    @Autowired
    public DrugDaoInMemory(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    @Override
    public List<Symptom> getDrugPurpose(String drugName) {
        return drugRepository.findPurposeByName(drugName);
    }

    @Override
    public Drug createDrug(Drug drug) {
        return drugRepository.addDrug(drug);
    }

    @Override
    public Drug updateDrug(Drug drug) {
        return drugRepository.updateDrug(drug);
    }
}
