package com.vlad.webfluxdemo.persistence.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "public", name = "user_role")
public class UserRole {
  @Id
  @Column(value = "role_id")
  private Long id;

  private String roleName;
}
