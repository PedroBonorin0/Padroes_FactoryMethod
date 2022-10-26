package Test;

import factorymethod.IServico;
import factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoCompraTest {

  @Test
  void deveConfirmarCompra() {
    IServico servico = ServicoFactory.novoServico("Compra");
    assertEquals("Compra confirmada!", servico.executar());
  }

  @Test
  void deveCancelarCompra() {
    IServico servico = ServicoFactory.novoServico("Compra");
    assertEquals("Compra cancelada com sucesso :(", servico.cancelar());
  }
}