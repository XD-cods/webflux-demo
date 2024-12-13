package com.vlad.webfluxdemo.persistence.entitiy;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@ToString
@Builder
@Table(schema = "public", name = "task_status")
public class TaskStatus {

  @Id
  @Column(value = "status_id")
  private Long id;

  private String statusName;
}
