package in.ashokit.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.ashokit.entity.UserAccount;
import jakarta.transaction.Transactional;



	public interface UserAccountRepo extends JpaRepository<UserAccount, Integer> {

	    @Modifying
	    @Transactional
	    @Query("UPDATE UserAccount ua SET ua.activesw = :status WHERE ua.userId = :userId")
	    void updateUserAccStatusById(@Param("userId") Integer id, @Param("status") String status);
	}
	
	