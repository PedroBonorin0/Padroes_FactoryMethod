package factorymethod;

public class ServicoCompra implements IServico{

  @Override
  public String executar() {
    return "Compra confirmada!";
  }

  @Override
  public String cancelar() {
    return "Compra cancelada com sucesso :(";
  }
}
