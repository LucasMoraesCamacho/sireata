package br.edu.utfpr.dv.sireata.factory;

import java.util.List;

import br.edu.utfpr.dv.sireata.model.Orgao;
import br.edu.utfpr.dv.sireata.model.Usuario;

public interface OrganFactory extends DaoFactory {
  public List<Orgao> listarTodos(boolean apenasAtivos) throws Exception;

  public List<Orgao> listarPorDepartamento(int idDepartamento) throws Exception;

  public List<Orgao> listarPorCampus(int idCampus) throws Exception;

  public List<Orgao> listarParaCriacaoAta(int idDepartamento, int idUsuario) throws Exception;
  
  public List<Orgao> listarParaConsultaAtas(int idDepartamento, int idUsuario) throws Exception;

  public Usuario buscarPresidente(int idOrgao) throws Exception;

  public Usuario buscarSecretario(int idOrgao) throws Exception;

  public boolean isMembro(int idOrgao, int idUsuario) throws Exception;
}
