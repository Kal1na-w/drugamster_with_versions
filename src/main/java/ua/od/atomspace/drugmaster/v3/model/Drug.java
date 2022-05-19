package ua.od.atomspace.drugmaster.v3.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Drug {
    private String name;

    @Singular("purpose")
    private List<Symptom> purposeList;

}
