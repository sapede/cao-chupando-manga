
package cao.chupando.manga.domain.dao;

import cao.chupando.manga.domain.entidades.AutorManga;
import java.util.List;

public interface IAutorMangaDAO {
    
    public void inserir(AutorManga ent);
    
    public void atualizar(AutorManga ent);
    
    public void remover(int id);
    
    public List<AutorManga> consultar();
    
}

	