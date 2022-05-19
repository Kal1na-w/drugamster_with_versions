package ua.od.atomspace.drugmaster.v2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.od.atomspace.drugmaster.v2.dao.repo.DrugRepository;
import ua.od.atomspace.drugmaster.v2.model.Symptom;

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
}
