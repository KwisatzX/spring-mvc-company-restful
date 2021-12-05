package io.github.kwisatzx.springmvccompany.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;
    @Column(name = "client_name")
    private String name;
    @OneToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    public Long getId() {
        return id;
    }

    public void setId(Long client_id) {
        this.id = client_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String client_name) {
        this.name = client_name;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
