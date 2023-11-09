package emose.co.mz.consultaCambio.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import emose.co.mz.consultaCambio.model.CambioRate;
import emose.co.mz.consultaCambio.repositorio.CambioRateRepo;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
@Service
public class CambioRateService {

    private CambioRateRepo cambioRateRepo;
    private ObjectMapper objectMapper;

    public CambioRateService (CambioRateRepo cambioRateRepo, ObjectMapper objectMapper ){
        this.cambioRateRepo = cambioRateRepo;
        this.objectMapper = objectMapper;
    }

    public void saveCambioRateFromFile( String filePath) throws IOException {
        CambioRate cambioRate = objectMapper.readValue(new File(filePath), CambioRate.class);
        cambioRateRepo.save(cambioRate);
    }
}
