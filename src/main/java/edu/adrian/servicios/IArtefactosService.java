package edu.adrian.servicios;

import java.util.List;

import edu.adrian.entities.Artefacto;

public interface IArtefactosService {

    public List<Artefacto> getArtefactos();
    public Artefacto getArtefacto(Long idUrl);
    public void deleteArtefactoId(Integer id);
    public Artefacto guardArtefacto(Artefacto ar);
    public Artefacto actualizarArtefacto(Artefacto ar);

}
