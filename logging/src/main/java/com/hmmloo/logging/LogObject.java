package com.hmmloo.logging;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogObject {
  @JsonProperty(index = 1)
  private String eventName;

  @JsonProperty(index = 2)
  private String traceId;

  @JsonProperty(index = 3)
  private String msg;

  @JsonProperty(index = 4)
  private long costTime;

  @JsonProperty(index = 6)
  private Integer userId;

  @JsonProperty(index = 7)
  private Object others;

  @JsonProperty(index = 8)
  private Object request;

  @JsonProperty(index = 9)
  private Object response;
}
