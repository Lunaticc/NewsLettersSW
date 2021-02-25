package newsletters.demo.repository;

import newsletters.demo.entity.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubRepository extends JpaRepository<Subscriber, Integer> {

}
