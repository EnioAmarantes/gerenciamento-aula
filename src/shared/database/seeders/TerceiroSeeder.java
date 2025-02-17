package shared.database.seeders;

import java.util.ArrayList;

import controllers.ProfessorController;
import controllers.TerceiroController;
import models.Funcao;
import models.Professor;
import models.Terceiro;

public class TerceiroSeeder extends ASeeder<Terceiro> {
	public TerceiroSeeder() {
		this.controller = new TerceiroController();
		ArrayList<Terceiro> terceiros = new ArrayList<Terceiro>(){
			{
				add(new Terceiro(0, "Maria Josefa", "josefa@gmail.com", new Funcao(1, "auxiliar de servi�os gerais")));
				add(new Terceiro(0, "Sebasti�o Moraes", "bastiao@gmail.com", new Funcao(2, "auxiliar de servi�os gerais")));
			}
		};
		this.models = terceiros;
	}
	
}
