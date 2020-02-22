package all;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VserverController {
	
	@Autowired
	VserverServiceImpl service ;
	
	@RequestMapping(value="/getVserver/{id}",method=RequestMethod.GET)
	public Vserver getTenant(@PathVariable(name="id") String id){
		
		return service.getVserverById(id);
	}
	
	
	@RequestMapping(value="/addVserver",method=RequestMethod.POST,produces = "application/json", consumes = "application/json")
	public Vserver addTenant(@RequestBody Vserver t){
		
		return service.addVserver(t);
	}
	
	@RequestMapping(value="/tenant/{id}/deleteVserver/",method=RequestMethod.DELETE,produces = "application/json")
	public void removeTenant(@PathVariable(name="id") String id ){
		System.out.println("=========================================="+id);
		selectTenant(id).stream().forEach(i->service.removeVserver(i));
		//return service.addVserver(t);
	}
	
	
	@RequestMapping(value="/tenant/{id}/selectVserver/",method=RequestMethod.GET,produces = "application/json")
	public List<String> selectTenant(@PathVariable(name="id") String id ){
		
		return service.selectallbytenant(id);
	}
	

}
