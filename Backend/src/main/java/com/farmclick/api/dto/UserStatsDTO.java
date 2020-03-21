package com.farmclick.api.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserStatsDTO {

    private String login;
    private BigDecimal coins;
    private Long clicks;
}
