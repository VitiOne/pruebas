package com.clases.victor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class PersonTest {

  @Test
  void testAboutGiveName(){
    final String NAME = "Victor";
    Person actual = new Person(NAME,"Be","666");

    assertEquals(NAME, actual.getGiveName());
  }
}
