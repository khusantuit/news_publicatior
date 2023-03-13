package com.example.news.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable implements BaseEntity{
    @Id
    @Column(unique = true)
    private String id;

    @CreatedDate
    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "timestamp default now()")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @CreatedBy
    @Column(name = "created_by")
    private String createdBy;

    @LastModifiedBy
    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "is_deleted", columnDefinition = "boolean default false", nullable = false)
    private Boolean deleted;

    @Column(name = "is_active", columnDefinition = "boolean default true", nullable = false)
    private Boolean status;// 0 => non active, 1 => active

    public Auditable() {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.status = true;
        this.deleted = false;
        this.createdAt = LocalDateTime.now();
    }

    public Auditable(String id, Boolean deleted, Boolean status) {
        this.id = id;
        this.status = status;
        this.deleted = deleted;
    }

    public Auditable(String id, Boolean status) {
        this.id = id;
        this.status = status;
    }
}
