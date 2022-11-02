package rikkei.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rikkei.academy.model.Customer;
@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
