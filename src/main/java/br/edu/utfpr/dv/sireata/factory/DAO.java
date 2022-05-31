package br.edu.utfpr.dv.sireata.factory;

import br.edu.utfpr.dv.sireata.dao.AnexoDAO;
import br.edu.utfpr.dv.sireata.dao.AtaDAO;
import br.edu.utfpr.dv.sireata.dao.AtaParticipanteDAO;
import br.edu.utfpr.dv.sireata.dao.ComentarioDAO;
import br.edu.utfpr.dv.sireata.dao.OrgaoDAO;

public enum DAO {
  Anexo {
    public AnexoDAO getAttachmentInstance() {
      return new AnexoDAO();
    }
  },
  Ata {
    public AtaDAO getAtaInstance() {
      return new AtaDAO();
    }
  },
  AtaParticipante {
    public AtaParticipanteDAO getAtaParticipantInstance() {
      return new AtaParticipanteDAO();
    }
  },
  Orgao {
    public OrgaoDAO getOrganInstance() {
      return new OrgaoDAO();
    }
  },
  Comentario {
    public ComentarioDAO getComentaryInstance() {
      return new ComentarioDAO();
    }
  };

  public AnexoDAO getAttachmentInstance() {
    return Anexo.getAttachmentInstance();
  }

  public AtaDAO getAtaInstance() {
    return Ata.getAtaInstance();
  }

  public AtaParticipanteDAO getAtaParticipantInstance() {
    return AtaParticipante.getAtaParticipantInstance();
  }

  public OrgaoDAO getOrganInstance() {
    return Orgao.getOrganInstance();
  }

  public ComentarioDAO getComentaryInstance() {
    return Comentario.getComentaryInstance();
  }
}
