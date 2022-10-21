import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void verify_full_name() {
        //Arrange
        Persona persona = new Persona("Juan", "Perez", "alevedoya@mail.com", 30);

        //Act
        persona.showName();
        //Assert
        Assertions.assertEquals("Juan Perez", persona.showName());
    }

    @Test
    void verify_age_older_than_18() {
        //Arrange
        Persona persona = new Persona("Juan", "Perez", "alevedoya@mail.com", 30);

        //Act
        persona.isOlder();

        //Assert
        assertEquals(true, persona.isOlder());
    }
}