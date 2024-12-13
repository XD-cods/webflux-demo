package com.vlad.webfluxdemo.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskResponse {
  @JsonProperty("task_id")
  private Long id;

  @JsonProperty("task_name")
  private String taskName;

  private String description;

  @JsonProperty("task_status")
  private Long taskStatus;

  private Long assignee;

  @JsonProperty("created_at")
  private LocalDateTime createdAt;
}
