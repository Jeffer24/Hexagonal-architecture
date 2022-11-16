package com.example.services.samplehexagonal;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Orders {
    private String id;
    private String cutomerId;
    private BigDecimal total;
}
