package selfstudy.springframework.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import selfstudy.springframework.msscbrewery.domain.Customer;
import selfstudy.springframework.msscbrewery.web.model.CustomerDTO;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDTOToCustomer(CustomerDTO customerDTO);
}
