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
@Table(schema = "public", name = "project")
public class Project {
  @Id
  @Column(value = "project_id")
  private Long id;
  private String projectName;
  private String description;


}
