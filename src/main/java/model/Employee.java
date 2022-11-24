package model;

import javax.persistence.*;

import java.util.Date;

@NamedQueries(
        {
                @NamedQuery(
                        name = "findEmployee",
                        query = "from Employee"
                ),
                @NamedQuery(
                        name = "DeleteEmployee",
                        query = "delete from Employee where id =:id"
                ),
                @NamedQuery(
                        name = "updateEmployee",
                        query = "update Employee set name=: name where id=:id"
                )
        }
)
@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Basic
    @Id
    //@SequenceGenerator(name = "emp_generator",sequenceName = "EMPLOYEE_SEQ",schema = "db", allocationSize = 2,initialValue = 1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID",nullable = false)
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name="SALARY")
    private int salary;
    @Transient // to ignore the field to not persist in database
    @Column(name="JOIN_DATE")
    private Date joiningDate;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name ="DEPT_ID")
    private Department department;

    public Employee() {
    }

    public Employee(int id, String name, int salary, Date joiningDate) {
        this.id = id;
        this.name = name;

        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
