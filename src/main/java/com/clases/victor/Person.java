package com.clases.victor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Person {

  private String name;
  private String lastName;
  private String phoneNumber;
  private String address;
  private int age;
  private Card card;


}
