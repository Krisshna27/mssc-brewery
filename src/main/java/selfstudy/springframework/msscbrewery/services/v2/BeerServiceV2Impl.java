package selfstudy.springframework.msscbrewery.services.v2;

import org.springframework.stereotype.Service;
import selfstudy.springframework.msscbrewery.web.model.BeerDTO;
import selfstudy.springframework.msscbrewery.web.model.v2.BeerDTOV2;
import selfstudy.springframework.msscbrewery.web.model.v2.BeerStyleEnum;

import java.util.UUID;

@Service
public class BeerServiceV2Impl  implements BeerServiceV2{

    @Override
    public BeerDTOV2 getBeerById(UUID beerId) {
        return BeerDTOV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy cat")
                .beerStyle(BeerStyleEnum.PALE_ALE)
                .build();
    }

    @Override
    public BeerDTOV2 saveNewBeer(BeerDTOV2 beerDTO) {
        return BeerDTOV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTOV2 beerDTO) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
