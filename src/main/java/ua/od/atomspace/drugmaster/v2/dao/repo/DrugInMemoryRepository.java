package ua.od.atomspace.drugmaster.v2.dao.repo;

import org.springframework.stereotype.Repository;
import ua.od.atomspace.drugmaster.v2.model.Drug;
import ua.od.atomspace.drugmaster.v2.model.Symptom;

import java.util.List;

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
}
