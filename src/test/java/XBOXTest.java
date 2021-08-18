import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XBOXTest {
    @Test
    public void deveRetornaControleJogador(){
        XBOX.getInstance().setControle("Controle Jogador 1");
        assertEquals("Controle Jogador 1", XBOX.getInstance().getControle());
    }
    @Test
    public void deveRetornaControleHeadset(){
        XBOX.getInstance().setControle("Headset Jogador 1");
        assertEquals("Headset Jogador 1", XBOX.getInstance().getControle());
    }
}