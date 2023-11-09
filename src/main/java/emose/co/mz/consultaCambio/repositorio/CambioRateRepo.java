package emose.co.mz.consultaCambio.repositorio;

import emose.co.mz.consultaCambio.model.CambioRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CambioRateRepo extends JpaRepository<CambioRate, Long> {
}
