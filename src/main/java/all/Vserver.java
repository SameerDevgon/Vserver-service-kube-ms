package all;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity

@NamedQuery(name = "Vserver.findAllOrderedById",
query = "SELECT v.id FROM Vserver v where v.tId= :myid")
//query = "SELECT new com.example.springRestAndDataJpaWithSpringBoot.EpDto (c.name, p.project) FROM Employee c INNER JOIN c.projects p where c.id= :myid")

public class Vserver {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

	public String getVserverName() {
		return vserverName;
	}

	public void setVserverName(String vserverName) {
		this.vserverName = vserverName;
	}

	@Column 
	String tId;
	

	@Column
	String vserverName;
	
	public Vserver(){};
		
	
	
	
	
	
	
}
