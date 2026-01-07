package com.klu.model;

import javax.persistence.*;

@Entity
@Table(name = "dept")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deptid")
    private int deptid;

    @Column(name = "deptname", nullable = false, length = 100)
    private String deptname;

    public Department() {
    }

    public Department(String deptname) {
        this.deptname = deptname;
    }

    public int getDeptId() {
        return deptid;
    }

    public void setDeptId(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptName() {
        return deptname;
    }

    public void setDeptName(String deptname) {
        this.deptname = deptname;
    }
}
