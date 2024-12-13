package com.vlad.webfluxdemo.persistence.entitiy;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@Table(schema = "public", name = "task")
public class Task {

  @Id
  @Column(value = "task_id")
  private Long id;

  private String taskName;

  private String description;

  private Long taskStatus;

  private Long assignee;

  @Builder.Default
  private LocalDateTime createdAt = LocalDateTime.now();
}
