package smart.senaigame.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.senaigame.entities.ProcessSeletivo;

@Repository
public interface ProcessRepository extends JpaRepository<ProcessSeletivo,Integer> {
}