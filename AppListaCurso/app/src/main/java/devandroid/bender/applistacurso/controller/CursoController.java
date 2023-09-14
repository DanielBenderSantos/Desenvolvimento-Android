package devandroid.bender.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.bender.applistacurso.model.Curso;

public class CursoController {
    private List listCursos;
    public List getListaDeCursos(){
        listCursos = new ArrayList<Curso>();
        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("HTML"));
        listCursos.add(new Curso("C#"));
        return listCursos;
    }

    public ArrayList<String>dadosParaSpinner(){
        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaDeCursos().size(); i++) {
            Curso obejeto = (Curso) getListaDeCursos().get(i);
            dados.add(obejeto.getNomeDoCursoDesejado());
        }

        return dados ;
    }
}
