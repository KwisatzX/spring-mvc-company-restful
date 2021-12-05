package io.github.kwisatzx.springmvccompany.model;

import javax.persistence.*;

@Entity
@Table(name = "branch_supplier")
public class BranchSupplier {
    @Id
    @OneToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
    @Id
    @Column(name = "supplier_name")
    private String supplier;
    @Column(name = "supply_type")
    private String type;
}