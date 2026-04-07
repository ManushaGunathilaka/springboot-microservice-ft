package com.manu.ms.order.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class SuccessMessage<T> {
    private String code;
    private String message;
    private String traceId;
    private String timestamp;
    private T data;
}
