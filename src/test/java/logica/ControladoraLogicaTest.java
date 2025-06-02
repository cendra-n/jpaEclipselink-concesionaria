package logica;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import persistencia.AutomovilJpaController;
import persistencia.ControladoraPersistencia;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ControladoraLogicaTest {

    @Mock
    private ControladoraPersistencia controlPersis;
    
    @Mock
    private AutomovilJpaController autoController;
    
    @InjectMocks
    private ControladoraLogica control;

    @Test
    public void testGuardarDatos_ValidacionExitosa() {
        // Configurar comportamiento de mocks
        when(autoController.existePatente(anyString(), any())).thenReturn(false);
        
        // Ejecutar
        control.guardarDatos("Civic", "Honda", "1.8L - 2.5L", "Azul", "XYZ789", "4");
        
        // Verificar
        verify(controlPersis).guardar(any(Automovil.class));
    }
}