package com.example.WWW_week05.models;

import com.example.WWW_week05.enums.SkillLevel;
import com.example.WWW_week05.id.JobSkillID;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "job_skill")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(JobSkillID.class)
public class JobSkill {
    @Column(name = "more_infos", length = 1000)
    private String moreInfos;
    @Column(name = "skill_level", length = 4)
    private SkillLevel skillLevel;

    @Id
    @OneToOne
    @JoinColumn(name = "skill_id")
    private Skill skillId;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job jobId;
}
