package ua.od.atomspace.drugmaster.v3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.od.atomspace.drugmaster.v3.dao.DrugDao;
import ua.od.atomspace.drugmaster.v3.model.Drug;
import ua.od.atomspace.drugmaster.v3.model.Symptom;

import java.util.List;

@Service
public class DrugPurposeServiceImpl implements DrugPurposeService {

    private DrugDao drugDao;

    @Autowired
    public DrugPurposeServiceImpl(DrugDao drugDao) {
        this.drugDao = drugDao;
    }

    @Override
    public Drug findPurpose(String drugName) {
        List<Symptom> drugPurpose = drugDao.getDrugPurpose(drugName);
        return Drug.builder()
                .name(drugName)
                .purposeList(drugPurpose)
                .build();
    }

    @Override
    public Drug createDrug(Drug drug) {
        return drugDao.createDrug(drug);
    }

    @Override
    public Drug updateDrug(Drug drug) {
        return drugDao.updateDrug(drug);
    }
}
