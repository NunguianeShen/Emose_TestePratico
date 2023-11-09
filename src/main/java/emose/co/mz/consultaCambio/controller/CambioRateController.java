package emose.co.mz.consultaCambio.controller;


import emose.co.mz.consultaCambio.service.CambioRateService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/cambio-rate")
public class CambioRateController {
   private final CambioRateService cambioRateService;

   public CambioRateController(CambioRateService cambioRateService){
       this.cambioRateService = cambioRateService;
   }

   @PostMapping("/load-from-file")
    public void loadCambioRateFromFile() throws IOException {
       cambioRateService.saveCambioRateFromFile("data/cambio-rate.json");
   }

}
