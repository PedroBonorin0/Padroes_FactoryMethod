package factorymethod;

public class ServicoMensalidade implements IServico{

  @Override
  public String executar() {
    return "Mensalidade paga com sucesso!";
  }

  @Override
  public String cancelar() {
    return "Assinatura cancelada com sucesso :(";
  }
}
