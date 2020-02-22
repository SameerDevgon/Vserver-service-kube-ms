package all;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class VserverServiceImpl {

	
	
	@Autowired 
	VserverRepository repo ;
	
	
	public Vserver getVserverById(String id){
		return repo.findById(id).get();
	}
	
	public Vserver addVserver(Vserver temp){
		return repo.saveAndFlush(temp);
	}
	
	
	public void removeVserver(String id){
		 repo.deleteById(id);
	}
	
	public List<String> selectallbytenant(String id){
		return repo.findAllOrderedById(id);
		
	}
}
