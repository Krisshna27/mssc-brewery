package selfstudy.springframework.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import selfstudy.springframework.msscbrewery.domain.Beer;
import selfstudy.springframework.msscbrewery.web.model.BeerDTO;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTO beerToBeerDTO(Beer beer);

    Beer beerDTOToBeer(BeerDTO dto);
}
