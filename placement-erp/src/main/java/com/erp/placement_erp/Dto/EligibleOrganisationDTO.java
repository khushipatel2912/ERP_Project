package com.erp.placement_erp.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EligibleOrganisationDTO {
    private String organisationName;
    private String organisationAddress;
    private String jobProfile;
    private String jobDescription;
    private int requiredGrade; // Minimum grade required by the organization
    private String requiredSpecialisation; // Specialisation name
    private String requiredDomain; // Domain name
    private int placement_id;

    // Constructor
    public EligibleOrganisationDTO(
            String organisationName,
            String organisationAddress,
            String jobProfile,
            String jobDescription,
            int requiredGrade,
            String requiredSpecialisation,
            String requiredDomain,
            int placement_id
    ) {
        this.organisationName = organisationName;
        this.organisationAddress = organisationAddress;
        this.jobProfile = jobProfile;
        this.jobDescription = jobDescription;
        this.requiredGrade = requiredGrade;
        this.requiredSpecialisation = requiredSpecialisation;
        this.requiredDomain = requiredDomain;
        this.placement_id=placement_id;
    }

    // Getters and setters (optional for some frameworks)
}