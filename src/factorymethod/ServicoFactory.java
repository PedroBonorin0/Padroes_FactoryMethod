package factorymethod;

public class ServicoFactory {

  public static IServico novoServico(String servico) {
    Class classe = null;
    Object objeto = null;
    try {
      classe = Class.forName("factorymethod.Servico" + servico);
      objeto = classe.newInstance();
    } catch (Exception ex) {
      throw new IllegalArgumentException("Serviço não cadastrado");
    }
    if (!(objeto instanceof IServico)) {
      throw new IllegalArgumentException("Erro ao criar Serviço");
    }
    return (IServico) objeto;
  }
}
