package emose.co.mz.consultaCambio.repositorio;

import emose.co.mz.consultaCambio.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepo extends JpaRepository<Rate,Long> {
}
