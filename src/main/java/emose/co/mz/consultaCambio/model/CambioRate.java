package emose.co.mz.consultaCambio.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class CambioRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String result;
    private String provider;
    private String dataTime;
    private String baseCurrency;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cambio_rate_id")
    private List<Rate> rates;

}
