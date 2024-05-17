package com.oto.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee") 
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="e_id",length = 20)
	private int empId;
	@Column(name = "e_name",length = 30)
	private String empName;
	@Column(name="Emp_salary",length = 40)
	private double salary;
	
	@OneToOne
	@JoinColumn(name="employee_adress_id")
	private Adress adress;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, double salary, Adress adress) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.adress = adress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", adress=" + adress + "]";
	}
	
	
	
	
	
	
	
}
