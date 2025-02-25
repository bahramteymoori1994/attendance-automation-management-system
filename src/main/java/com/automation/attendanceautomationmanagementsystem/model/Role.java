package com.automation.attendanceautomationmanagementsystem.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)

@Entity(name="roleEntity")
@Table(name="role_tbl")
public class Role {
    @Id
    @Column(name = "role_name", nullable = false, length = 30)
    private String name;

    // Constructor to handle deserialization from string
    public Role(String name) {
        this.name = name;
    }

    @Column(name = "description", length = 2000)
    private String description;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "USER_ROLE", joinColumns = @JoinColumn(name = "USER_ID"),
    inverseJoinColumns = @JoinColumn(name = "ROLE_ID"), foreignKey = @ForeignKey(name = "FK_USER_ROLE"),
    inverseForeignKey = @ForeignKey(name = "FK_INVERSE_USER_ROLE"))
    private List<User> users;
}