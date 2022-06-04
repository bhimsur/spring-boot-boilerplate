package io.bhimsur.springbootboilerplate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user_account")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Example implements Serializable {

    private static final long serialVersionUID = 7330829920865665364L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_date")
    private Date createDate;

    @Column(length = 50, name = "created_by")
    private String createdBy;
}
