package Test;

import factorymethod.IServico;
import factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoAcessoEstadioTest {

  @Test
  void devePagarMensalidade() {
    IServico servico = ServicoFactory.novoServico("AcessoEstadio");
    assertEquals("Acesso ao próximo jogo confirmado!", servico.executar());
  }

  @Test
  void deveCancelarAssinatura() {
    IServico servico = ServicoFactory.novoServico("AcessoEstadio");
    assertEquals("Acesso ao próximo jogo cancelado :(", servico.cancelar());
  }
}