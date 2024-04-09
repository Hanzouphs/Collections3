import java.util.*
;
public class ExemploSet {
    public static void main(String[] args) throws Exception {
        
        Set<Double> notas = new HashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        // System.out.println("Crie um conjunto e adicione as notas: ");
        // System.out.println(notas.toString());
        // System.out.println(" ");
        
        // System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        // System.out.println(" ");
        
        // System.out.println("Confira a maior nota do conjunto: " +  Collections.max(notas));
        // System.out.println(" ");
        // System.out.println("Confira a menor nota do  conjunto: " + Collections.min(notas));
        // System.out.println(" ");
        // System.out.println("Remova a nota 0: ");
        // notas.remove(0d);
        // System.out.println(notas.toString());
        // System.out.println(" ");
        // Iterator<Double> iterator = notas.iterator();
        // while(iterator.hasNext()){
        //     Double next = iterator.next();
        //     if(next < 7) iterator.remove();
        // }
        System.out.println(notas.toString());
        System.out.println(" ");
        Set<Double> notas2 = new LinkedHashSet<>(notas);
        System.out.println(notas2.toString());
        System.out.println(" ");
        
        Set<Double> notas3 = new TreeSet<>(notas);
        System.out.println(notas3.toString());
        System.out.println(" ");
        
        System.out.println("Apague todas a notas do conjunto:");
        notas.clear();
        System.out.println(" ");
        System.out.println("Confira se a nota do conjunto está vazia: " + notas.isEmpty());
        System.out.println(" ");
        System.out.println("Confira se a nota do conjunto 2 está vazia: " + notas2.isEmpty());
        System.out.println(" "); 
        System.out.println("Confira se a nota do conjunto 3 está vazia: " + notas3.isEmpty());
        System.out.println(" ");


    }
}
