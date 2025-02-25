package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)

@Entity(name="sectionEntity")
@Table(name="section_tbl")
public class Section {
    @Id
    @SequenceGenerator(name = "sectionSeq", sequenceName = "section_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sectionSeq")
    @Column(name = "section_id")
    private Long id;

    @Column(name = "address", nullable = false, length = 2000)
    private String address;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "phone_number", nullable = false, unique = true, length = 15)
    private String phoneNumber;

    @Column(name = "internal_code", nullable = false, length = 4)
    private String internalCode;

    @Column(name = "section_number", nullable = false, length = 5)
    private String sectionNumber;

    @Column(name = "access_level", nullable = false)
    private boolean accessLevel;

    //todo check relation
    @OneToMany(mappedBy = "section")
    private List<Department> departmentList;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "section_user_tbl",
            joinColumns = @JoinColumn(name = "section_name"),
            inverseJoinColumns = @JoinColumn(name = "user_name"),
            foreignKey = @ForeignKey(name = "fk_section_user"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_section_user")
    )
    private Set<User> userSet;

}
