package Test;

import factorymethod.IServico;
import factorymethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

  @Test
  void geraExcecaoCriacaoServico() {
    try {
      IServico servico = ServicoFactory.novoServico("RecebimentoPremios");
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Serviço não cadastrado", e.getMessage());
    }
  }

  @Test
  void deveRetornarExcecaoParaServicoInvalido() {
    try {
      IServico servico = ServicoFactory.novoServico("RecebePremios");
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Erro ao criar Serviço", e.getMessage());
    }
  }
}