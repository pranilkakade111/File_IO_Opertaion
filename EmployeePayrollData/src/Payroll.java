import java.io.Serializable;

public class Payroll implements Serializable
{
	 private Integer id;
	 
	 private String name;
	 
	 private Double salary;
	 
	 public Payroll()
	 {
		 
	 }
	 
	public Payroll(Integer id, String name, Double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() 
	{
		return "PogoEmp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) 
	{    
     
	}

}
