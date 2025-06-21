import java.util.ArrayList;

public class TarefasFiltro {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercìcios");
        tarefas.add("Revisar còdigo");

        for (String tarefa : tarefas){
            if (tarefa.contains("Java")){
                System.out.println("Tarefa de programação: " + tarefa);
            }
        }
    }
}
