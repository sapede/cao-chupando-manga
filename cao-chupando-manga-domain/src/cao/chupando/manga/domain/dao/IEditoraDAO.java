/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.Editora;
import java.util.List;

/**
 *
 * @author gustavo
 */
public interface IEditoraDAO {
    
    public void inserir(Editora ent);
    
    public void atualizar(Editora ent);
    
    public void remover( int id);
    
    public List<Editora> consultar();
    
}
