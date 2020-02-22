package all;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VserverRepository extends JpaRepository<Vserver,String>{

	List<String> findAllOrderedById(@Param("myid") String myid);
	
}
