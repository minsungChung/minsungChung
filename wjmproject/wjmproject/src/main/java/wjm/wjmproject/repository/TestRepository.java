package wjm.wjmproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wjm.wjmproject.domain.Restaurant;

import java.util.List;

public interface TestRepository extends JpaRepository<Restaurant,Long> {
    List<Restaurant> findAllByArea(String area);
}
