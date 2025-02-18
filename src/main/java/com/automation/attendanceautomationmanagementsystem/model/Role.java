package com.automation.attendanceautomationmanagementsystem.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "role_permission_tbl",
//            joinColumns = @JoinColumn(name = "role_name"),
//            inverseJoinColumns = @JoinColumn(name = "permission"),
//            foreignKey = @ForeignKey(name = "fk_role_permission"),
//            inverseForeignKey = @ForeignKey(name = "fk_inverse_role_permission")
//    )
//    private Set<Permission> permissionSet;
//
//    // Constructor to handle deserialization from string
//    public Role(String name) {
//        this.name = name;
//    }

    @Column(name = "description", length = 2000)
    private String description;
}