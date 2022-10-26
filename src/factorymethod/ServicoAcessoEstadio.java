package factorymethod;

public class ServicoAcessoEstadio implements IServico{

  @Override
  public String executar() {
    return "Acesso ao próximo jogo confirmado!";
  }

  @Override
  public String cancelar() {
    return "Acesso ao próximo jogo cancelado :(";
  }
}
