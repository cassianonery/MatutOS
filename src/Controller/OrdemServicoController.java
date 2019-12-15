package Controller;

import DAO.OrdemServicoDAO;
import Interface.InterfaceOrdemDeServico;
import Model.OrdemDeServico;
import java.util.List;

public class OrdemServicoController implements InterfaceOrdemDeServico {

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void create(OrdemDeServico ordemServico) throws Exception {
        
            //Object Treatment↓------------------------------------------------------------------
            if (ordemServico == null) {
                throw new Exception("Objeto Ordem de Serviço não pode ser Nulo: Favor insira os dados corretamente");
            }

            Validations.matricula(ordemServico.getFuncionarioOs().getMatricula());  //←REGISTRATION Treatment
            Validations.cpf(ordemServico.getClienteOs().getCpf());                  //←CPF Treatment
            Validations.codigoProb(ordemServico.getProblemaOs().getCodigo());       //←CODE Prob Treatment
            Validations.data(ordemServico.getDataCadastroOS());                     //←DATE Treatment
            Validations.descrição(ordemServico.getDescricaoProblemaOS());           //←DESCRIPTION Treatment

            //jogar para os DADOS↓
            new OrdemServicoDAO().create(ordemServico);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void update(OrdemDeServico ordemServico) throws Exception {
        
            //Object Treatment↓------------------------------------------------------------------
            if (ordemServico == null) {
                throw new Exception("Objeto Ordem de Serviço não pode ser Nulo: Favor insira os dados corretamente");
            }

            Validations.numeroOs(ordemServico.getNumeroOS());                       //←NumberOS Treatment
            Validations.matricula(ordemServico.getFuncionarioOs().getMatricula());  //←REGISTRATION Treatment
            Validations.cpf(ordemServico.getClienteOs().getCpf());                  //←CPF Treatment
            Validations.codigoProb(ordemServico.getProblemaOs().getCodigo());       //←CODE Prob Treatment
            Validations.data(ordemServico.getDataCadastroOS());                     //←DATE Treatment
            Validations.descrição(ordemServico.getDescricaoProblemaOS());           //←DESCRIPTION Treatment

            //jogar para os DADOS↓
            new OrdemServicoDAO().update(ordemServico);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------   

    @Override
    public List<OrdemDeServico> read() throws Exception {
        return new OrdemServicoDAO().read();
    }

    public List<OrdemDeServico> read(String numero) throws Exception {
        return new OrdemServicoDAO().read(numero);
    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------END---------------------------------------------------------------------------------------------------------   
    @Override
    public void solucionar(OrdemDeServico os) throws Exception {
        //Object Treatment↓------------------------------------------------------------------
        if (os == null) {
            throw new Exception("Objeto Ordem de Serviço não pode ser Nulo: Favor insira os dados corretamente");
        }

        Validations.numeroOs(os.getNumeroOS());
        Validations.data(os.getDataSolucaoOS());
        Validations.descrição(os.getDescricaoServicoOS());

        //jogar para os DADOS↓
        new OrdemServicoDAO().solucionar(os);
    }

    @Override
    public void cancelar(OrdemDeServico os) throws Exception {
        //Object Treatment↓------------------------------------------------------------------
        if (os == null) {
            throw new Exception("Objeto Ordem de Serviço não pode ser Nulo: Favor insira os dados corretamente");
        }

        Validations.numeroOs(os.getNumeroOS());
        Validations.data(os.getDataCancelamentoOS());
        Validations.descrição(os.getMotivoCancelamentoOS());
        
        //jogar para os DADOS↓
        new OrdemServicoDAO().cancelar(os);
    }
}
