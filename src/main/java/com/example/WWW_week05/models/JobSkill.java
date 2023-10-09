package com.example.WWW_week05.models;

import com.example.WWW_week05.enums.SkillLevel;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "job_skill")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobSkill {
    @Column(name = "more_infos", length = 1000)
    private String moreInfos;
    @Column(name = "skill_level", length = 4)
    private SkillLevel skillLevel;

    @OneToMany
    @JoinColumn(name = "skill_id")
    @Column(name = "skil_id", length = 20)
    private Skill skillID;

    @ManyToOne
    @JoinColumn(name = "job_id")
    @Column(name = "job_id")
    private Job id;
}
