package com.manu.ms.order.response;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class ErrorResponse {
    private String code;
    private String message;
    private String traceId;
    private String timestamp;
    private Object details;
}
