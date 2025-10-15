import java.lang.reflect.Array;
import java.util.ArrayList;

public class Estudante{


    private String name;
    private ArrayList<Integer> notas;
    private int disciplinas;


    //Construtor

    public Estudante() {
        this.name = "Estudante";
        this.disciplinas = -1;
        this.notas = new ArrayList<>();
    }


    //Getters e Setters

    /*Get Name */
    public String getName(){
        return name;
    }

    /*Get Notas */
    public ArrayList<Integer> getNotas(){
        return notas;
    }

    /*Get Disciplinas*/
    public int getDisciplinas(){
        return disciplinas;
    }

    /*Set Disciplinas */
    public void setDisciplinas(int disciplinas){
        this.disciplinas = disciplinas;
    }

    /*Set Notas */
    public void setNotas(ArrayList<Integer> notas){
        this.notas = notas;
    }

    /*Set Name */
    public void setName(String name){
        this.name = name;
    }

    //Methods

    public void addGrade(int grade){
        this.notas.add(grade);
    }

    public String toString(){
        return "";
    }
}