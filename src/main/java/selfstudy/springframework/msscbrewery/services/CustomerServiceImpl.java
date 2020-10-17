package selfstudy.springframework.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import selfstudy.springframework.msscbrewery.services.CustomerService;
import selfstudy.springframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomer(UUID customerId) {
        return CustomerDTO.builder().id(customerId)
                .name("krisshna").build();
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
       return CustomerDTO.builder()
               .id(UUID.randomUUID())
               .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleted customer");
    }
}
