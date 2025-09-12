package org.mymicroservices.common.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentEventDto {
    private String id;
    private String orderId;
    private String userId;
    private String status;
    private String timestamp;
    private BigDecimal paymentAmount;
}
