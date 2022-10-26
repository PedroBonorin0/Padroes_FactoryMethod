package Test;

import factorymethod.IServico;
import factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoMensalidadeTest {

  @Test
  void devePagarMensalidade() {
    IServico servico = ServicoFactory.novoServico("Mensalidade");
    assertEquals("Mensalidade paga com sucesso!", servico.executar());
  }

  @Test
  void deveCancelarAssinatura() {
    IServico servico = ServicoFactory.novoServico("Mensalidade");
    assertEquals("Assinatura cancelada com sucesso :(", servico.cancelar());
  }
}