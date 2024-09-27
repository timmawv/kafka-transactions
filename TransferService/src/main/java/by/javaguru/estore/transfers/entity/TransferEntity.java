package by.javaguru.estore.transfers.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "transfers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransferEntity implements Serializable {

    private static final long serialVersionUID = -283413812379472948L;

    @Id
    @Column(name = "transfer_id", nullable = false)
    private String transferId;

    @Column(name = "sender_id", nullable = false)
    private String senderId;

    @Column(name = "recepient_id", nullable = false)
    private String recepientId;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
}