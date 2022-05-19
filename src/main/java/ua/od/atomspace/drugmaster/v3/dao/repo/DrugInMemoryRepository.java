package ua.od.atomspace.drugmaster.v3.dao.repo;

import org.springframework.stereotype.Repository;
import ua.od.atomspace.drugmaster.v3.model.Drug;
import ua.od.atomspace.drugmaster.v3.model.Symptom;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DrugInMemoryRepository implements DrugRepository {

    private List<Drug> drugs = List.of(
            Drug.builder()
                    .name("Noshpa")
                    .purpose(Symptom.STOMACH)
            .build(),
            Drug.builder()
                    .name("Aspirin")
                    .purpose(Symptom.HEADACHE)
                    .purpose(Symptom.TOOTHACHE)
                    .build()
    );

    @Override
    public List<Symptom> findPurposeByName(String name) {
        return drugs.stream()
                .filter(drug -> drug.getName().equals(name))
                .findFirst()
                .orElseThrow()
                .getPurposeList();
    }

    @Override
    public Drug addDrug(Drug drug) {
        drugs.add(drug);
        return drug;
    }

    @Override
    public Drug updateDrug(Drug drug) {
        drugs = drugs.stream().map(drug1 -> {
            if (drug1.getName().equals(drug.getName())) {
                return drug;
            }
            return drug1;
        }).collect(Collectors.toList());
        return drug;
    }

    @Override
    public void deleteDrug(Drug drug) {
        drugs = drugs.stream().map(drug1 -> {
            if (drug1.getName().equals(drug.getName())) {
                return null;
            }
            return drug1;
        }).collect(Collectors.toList());
    }
}
