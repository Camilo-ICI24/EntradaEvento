import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntradaEventoTest {

    @Test
    public void testVerificarEdad() {
        String[][] informacion = {
                {"Oscar", "20", "vip", "1", "true"},
                {"Tomas", "17", "general", "0", "false"},
        };
        assertTrue(EntradaEvento.verificarEdad(informacion, 0));
        assertFalse(EntradaEvento.verificarEdad(informacion, 1));
    }

    @Test
    public void testVerificarBoleto() {
        String[][] informacion = {
                {"Luis", "34", "vip", "1", "true"},
                {"Guillermo", "17", null, "0", "false"},
        };
        assertEquals("vip", EntradaEvento.verificarBoleto(informacion, 0));
        assertEquals("False", EntradaEvento.verificarBoleto(informacion, 1));
    }

    @Test
    public void testValidarInvitados() {
        String[][] informacion = {
                {"Ernesta", "20", "vip", "3", "true"},
                {"Yuyuniz", "17", "vip", "2", "false"},
        };
        assertFalse(EntradaEvento.validarInvitados(informacion, 0));
        assertTrue(EntradaEvento.validarInvitados(informacion, 1));
    }

    @Test
    public void testAforoVip() {
        String[][] informacion = {
                {"Ricardo", "21", "vip", "2", "true"},
                {"Wojciech", "12", "vip", "1", "false"},
                {"Chris", "29", "general", "0", "true"},
        };
        assertEquals(5, EntradaEvento.aforoVip(informacion));
    }

    @Test
    public void testAforoGeneral() {
        String[][] informacion = {
                {"Consuelo", "20", "vip", "2", "true"},
                {"Ricarda", "18", "general", "1", "false"},
                {"Edson", "20", "general", "0", "true"},
        };
        assertEquals(2, EntradaEvento.aforoGeneral(informacion));
    }

    @Test
    public void testPermitirEntrada() {
        String[][] informacion = {
                {"Iñigo", "18", "vip", "2", "true"},
                {"María", "15", "general", "1", "false"},
                {"Mónica", "40", "general", "0", "true"},
        };
        assertTrue(EntradaEvento.permitirEntrada(informacion, 0));
        assertFalse(EntradaEvento.permitirEntrada(informacion, 1));
    }
}
