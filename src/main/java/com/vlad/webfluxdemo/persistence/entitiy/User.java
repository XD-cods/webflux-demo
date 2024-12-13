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
@Table(schema = "public", name = "user")
public class User {

  @Id
  @Column(value = "user_id")
  private String id;

  private String username;

  private String password;

  private Long role;
}
