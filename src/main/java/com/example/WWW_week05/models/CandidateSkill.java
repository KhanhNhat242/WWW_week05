package com.example.WWW_week05.models;

import com.example.WWW_week05.enums.SkillLevel;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "candidate_skill")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CandidateSkill {
    @Column(name = "more_infos", length = 1000)
    private String moreInfos;
    @Column(name = "skill_level", length = 4)
    private SkillLevel skillLevel;

    @OneToOne
    @JoinColumn(name = "skill_id")
    @Column(name = "skill_id", length = 20)
    private Skill skillId;

    @OneToOne
    @JoinColumn(name = "can_id")
    @Column(name = "can_id", length = 20)
    private Candidate canId;
}
