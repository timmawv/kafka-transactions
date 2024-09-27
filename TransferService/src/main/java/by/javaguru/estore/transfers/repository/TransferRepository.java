package by.javaguru.estore.transfers.repository;

import by.javaguru.estore.transfers.entity.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<TransferEntity, String> {

}