package papw.project.dao;



import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import papw.project.model.YenAndEuro;

@Repository
public class YenAndEuroDAO {
	
	private static List<YenAndEuro> yenandeuros;
	
	public YenAndEuroDAO() {
		yenandeuros = new LinkedList<YenAndEuro>();
	}
	public void save(YenAndEuro yenandeuro) {
		yenandeuros.add(yenandeuro);
	}
	
		List<YenAndEuro> getAll(){
			return yenandeuros; 
			}
}
