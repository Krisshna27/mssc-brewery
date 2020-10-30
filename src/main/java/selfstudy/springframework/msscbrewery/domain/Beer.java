package selfstudy.springframework.msscbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import selfstudy.springframework.msscbrewery.web.model.v2.BeerStyleEnum;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;

    private String beerName;

    private BeerStyleEnum beerStyle;

    private Long upc;

    private Timestamp createdDate;

    private Timestamp lastUpdatedDate;
}
