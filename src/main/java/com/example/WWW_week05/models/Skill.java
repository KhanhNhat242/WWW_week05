package com.example.WWW_week05.models;

import com.example.WWW_week05.enums.SkillType;
import jakarta.persistence.*;
import lombok.*;
@Table(name = "skill")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(of = {"id"})
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id", length = 20)
    private long id;
    @Column(name = "skill_desc", length = 300)
    private String skillDesc;
    @Column(name = "skill_type", length = 4)
    private SkillType skillType;
    @Column(name = "skill_name", length = 150)
    private String skillName;

    public Skill(String skillDesc, SkillType skillType, String skillName) {
        this.skillDesc = skillDesc;
        this.skillType = skillType;
        this.skillName = skillName;
    }
}
