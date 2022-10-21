import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void validate_full_name(){
        //Arrange
        Persona persona = new Persona("José", "Perez", "joseperez@mail.com", 30);

        //Act
        persona.showFullName();

        //Assert
        Assertions.assertEquals("José Perez", persona.showFullName());
    }

    @Test
    void validate_is_older_than_18() {
        //Arrange
        Persona persona = new Persona("José", "Perez", "joseperez@mail.com", 30);

        //Act
        persona.isOlderThan18();

        //Assert
        Assertions.assertTrue(persona.isOlderThan18());

    }
}