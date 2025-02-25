package com.automation.attendanceautomationmanagementsystem.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EntityListeners(AuditingEntityListener.class)

@Entity(name="userEntity")
@Table(name="user_tbl")
public class User {
    @Id
    @Column(name = "user_name", unique = true, nullable = false, length = 50)
    private String username;

    //    @JsonIgnore
    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "last_login", nullable = false)
    private LocalDateTime lastLogin;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role_tbl",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "role_name"),
            foreignKey = @ForeignKey(name = "fk_user_role"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_user_role")
    )
    private Set<Role> roleSet;

    public void addRole(Role role){
        if(roleSet == null){
            roleSet = new HashSet<>();
        }
        roleSet.add(role);
    }

    //todo check relation
    @OneToMany(mappedBy = "user")
    private List<Organization> organizationList;

    //todo check relation
    @OneToMany(mappedBy = "user")
    private List<Department> departmentList;

}
